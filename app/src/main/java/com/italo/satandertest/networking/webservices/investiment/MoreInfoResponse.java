package com.italo.satandertest.networking.webservices.investiment;

import com.google.gson.annotations.SerializedName;

public class MoreInfoResponse {

    private MoreInfoDetailResponse month;
    private MoreInfoDetailResponse year;
    @SerializedName("12months")
    private MoreInfoDetailResponse twelveMonths;

    public MoreInfoDetailResponse getMonth() {
        return month;
    }

    public MoreInfoDetailResponse getYear() {
        return year;
    }

    public MoreInfoDetailResponse getTwelveMonths() {
        return twelveMonths;
    }

}
