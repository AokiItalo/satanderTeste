package com.italo.satandertest.investiment;

import com.italo.satandertest.networking.webservices.investiment.InvestmentResponse;


public interface OnRequestInvestmentListener {

    void onRequestFundSuccess(InvestmentResponse response);

    void onRequestFundFailed(int messageResourceId);

}
