package com.italo.satandertest.base;

import com.italo.satandertest.networking.BaseNetworkConfig;



public class BaseInteractorImpl {

    public <S> S createApi(Class<S> apiClass){
        return BaseNetworkConfig.buildRetrofit().create(apiClass);
    }
}
