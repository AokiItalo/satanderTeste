package com.italo.satandertest.networking.webservices.contact;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface ContactAPI {

    @Headers("Accept: application/json")
    @GET("cells.json")
    Call<CellsResponse> getCells();

}
