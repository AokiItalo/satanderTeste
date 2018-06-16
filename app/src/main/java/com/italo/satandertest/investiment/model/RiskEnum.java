package com.italo.satandertest.investiment.model;

import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;
import org.parceler.ParcelConstructor;
import org.parceler.ParcelProperty;

@Parcel(Parcel.Serialization.BEAN)
public enum RiskEnum {

    @SerializedName("1")
    RISK_LOWER(1),
    @SerializedName("2")
    RISK_LOW(2),
    @SerializedName("3")
    RISK_MEDIUM(3),
    @SerializedName("4")
    RISK_HIGH(4),
    @SerializedName("5")
    RISK_HIGHER(5);

    @ParcelProperty("risk")
    public final int risk;

    @ParcelConstructor
    RiskEnum( @ParcelProperty("risk") int risk) {
        this.risk = risk;
    }
}
