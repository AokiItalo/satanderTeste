package com.italo.satandertest.investiment;

import com.italo.satandertest.R;
import com.italo.satandertest.base.BaseInteractorImpl;
import com.italo.satandertest.networking.webservices.investiment.InvestimentAPI;
import com.italo.satandertest.networking.webservices.investiment.InvestmentResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class InvestmentInteractorImpl extends BaseInteractorImpl implements InvestmentInteractor{


    @Override
    public void getFund(final OnRequestInvestmentListener listener) {
        InvestimentAPI api = createApi(InvestimentAPI.class);
        Call<InvestmentResponse> call = api.getFund();
        call.enqueue(new Callback<InvestmentResponse>() {
            @Override
            public void onResponse(Call<InvestmentResponse> call, Response<InvestmentResponse> response) {
                if(response.isSuccessful()){
                    listener.onRequestFundSuccess(response.body());
                }else{
                    listener.onRequestFundFailed(R.string.generic_error);
                }
            }

            @Override
            public void onFailure(Call<InvestmentResponse> call, Throwable t) {
                listener.onRequestFundFailed(R.string.generic_error);
            }
        });
    }
}
