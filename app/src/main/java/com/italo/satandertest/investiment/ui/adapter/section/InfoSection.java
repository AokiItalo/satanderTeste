package com.italo.satandertest.investiment.ui.adapter.section;

import com.italo.satandertest.investiment.model.Info;

import org.parceler.Parcel;
import org.parceler.ParcelConstructor;

@Parcel(Parcel.Serialization.BEAN)
public class InfoSection extends InvestmentSection {

    private Info mInfo;

    @ParcelConstructor
    public InfoSection(Info info) {
        this.mInfo = info;
    }

    public Info getInfo() {
        return mInfo;
    }

    @Override
    public int getItemViewType() {
        return TYPE_INFO;
    }
}
