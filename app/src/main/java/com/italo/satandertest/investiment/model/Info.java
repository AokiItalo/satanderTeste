package com.italo.satandertest.investiment.model;

import org.parceler.Parcel;
import org.parceler.ParcelConstructor;


@Parcel(Parcel.Serialization.BEAN)
public class Info {

    private String name;
    private String data;

    @ParcelConstructor
    public Info(String name, String data) {
        this.name = name;
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
