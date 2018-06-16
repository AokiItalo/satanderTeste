package com.italo.satandertest.investiment.ui.adapter.section;

import com.italo.satandertest.investiment.model.Header;

import org.parceler.Parcel;
import org.parceler.ParcelConstructor;
import org.parceler.ParcelProperty;


@Parcel(Parcel.Serialization.BEAN)
public class HeaderSection extends InvestmentSection {

    @ParcelProperty("header")
    private Header mHeader;

    @ParcelConstructor
    public HeaderSection( @ParcelProperty("header")Header mHeader) {
        this.mHeader = mHeader;
    }

    @Override
    public int getItemViewType() {
        return TYPE_HEADER;
    }

    public Header getHeader() {
        return mHeader;
    }
}
