package com.italo.satandertest.contact.ui;

import com.italo.satandertest.R;
import com.italo.satandertest.base.BaseInteractorImpl;
import com.italo.satandertest.contact.ContactInteractor;
import com.italo.satandertest.contact.OnRequestContactListener;
import com.italo.satandertest.networking.webservices.contact.CellsResponse;
import com.italo.satandertest.networking.webservices.contact.ContactAPI;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;



public class ContactInteractorImpl extends BaseInteractorImpl implements ContactInteractor {

    @Override
    public void getContact(final OnRequestContactListener listener) {
        ContactAPI api = createApi(ContactAPI.class);
        Call<CellsResponse> call = api.getCells();
        call.enqueue(new Callback<CellsResponse>() {
            @Override
            public void onResponse(Call<CellsResponse> call, Response<CellsResponse> response) {
                if(response.isSuccessful()){
                    listener.onRequestContactSuccess(response.body());
                }else{
                    listener.onRequestContactFailed(R.string.generic_error);
                }
            }

            @Override
            public void onFailure(Call<CellsResponse> call, Throwable t) {
                listener.onRequestContactFailed(R.string.generic_error);
            }
        });
    }
}
