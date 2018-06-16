package com.italo.satandertest.investiment.ui.adapter.section;

import com.italo.satandertest.investiment.model.Info;

import org.parceler.Parcel;
import org.parceler.ParcelConstructor;
import org.parceler.ParcelProperty;


@Parcel(Parcel.Serialization.BEAN)
public class DowInfoSection extends InvestmentSection {

    @ParcelProperty("info")
    private Info mInfo;

    @ParcelConstructor
    public DowInfoSection(@ParcelProperty("info") Info mInfo) {
        this.mInfo = mInfo;
    }

    public Info getInfo() {
        return mInfo;
    }

    @Override
    public int getItemViewType() {
        return TYPE_DOW_INFO;
    }
}
