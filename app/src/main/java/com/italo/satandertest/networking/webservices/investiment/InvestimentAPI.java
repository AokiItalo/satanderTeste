package com.italo.satandertest.networking.webservices.investiment;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;


public interface InvestimentAPI {

    @Headers("Accept: application/json")
    @GET("fund.json")
    Call<InvestmentResponse> getFund();

}
