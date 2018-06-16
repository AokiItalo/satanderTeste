package com.italo.satandertest.investiment.ui.adapter.section;

import com.italo.satandertest.investiment.model.MoreInfo;

import org.parceler.Parcel;
import org.parceler.ParcelConstructor;
import org.parceler.ParcelProperty;


@Parcel(Parcel.Serialization.BEAN)
public class MoreInfoSection extends InvestmentSection {

    @ParcelProperty("moreinfo")
    private MoreInfo mMoreInfo;

    @ParcelConstructor
    public MoreInfoSection( @ParcelProperty("moreinfo")MoreInfo mMoreInfo) {
        this.mMoreInfo = mMoreInfo;
    }

    public MoreInfo getMoreInfo() {
        return mMoreInfo;
    }

    @Override
    public int getItemViewType() {
        return TYPE_MORE_INFO;
    }
}
