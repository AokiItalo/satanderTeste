package com.italo.satandertest.contact.model;

import com.google.gson.annotations.SerializedName;


public enum TypeFieldEnum {
    @SerializedName("1")
    TEXT(1),
    @SerializedName("telnumber")
    TEL_NUMBER(2),
    @SerializedName("3")
    EMAIL(3);

    public final int typeField;

    TypeFieldEnum(int i) {
        this.typeField = i;
    }
}
