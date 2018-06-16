package com.italo.satandertest.investiment.model;

import org.parceler.Parcel;
import org.parceler.ParcelConstructor;


@Parcel(Parcel.Serialization.BEAN)
public class Risk {

    private String riskTitle;
    private int risk;

    @ParcelConstructor
    public Risk(String riskTitle, int risk) {
        this.riskTitle = riskTitle;
        this.risk = risk;
    }

    public String getRiskTitle() {
        return riskTitle;
    }

    public void setRiskTitle(String riskTitle) {
        this.riskTitle = riskTitle;
    }

    public int getRisk() {
        return risk;
    }

    public void setRisk(int risk) {
        this.risk = risk;
    }
}
