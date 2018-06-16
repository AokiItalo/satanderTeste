package com.italo.satandertest.networking.webservices.contact;

import com.italo.satandertest.contact.model.TypeEnum;
import com.italo.satandertest.contact.model.TypeFieldEnum;
import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

@Parcel(Parcel.Serialization.BEAN)
public class CellResponse {

    private Integer id;
    private TypeEnum type;
    private String message;
    @SerializedName("typefield")
    private TypeFieldEnum typeField;
    private boolean hidden;
    private double topSpacing;
    private Integer show;
    private boolean required;

    public Integer getId() {
        return id;
    }

    public TypeEnum getType() {
        return type;
    }

    public String getMessage() {
        return message;
    }

    public boolean isHidden() {
        return hidden;
    }

    public Integer getShow() {
        return show;
    }

    public boolean isRequired() {
        return required;
    }

    public TypeFieldEnum getTypeField() {
        return typeField;
    }

    public double getTopSpacing() {
        return topSpacing;
    }
}
