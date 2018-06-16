package com.italo.satandertest.investiment.ui.adapter.section;

import org.parceler.Parcel;

@Parcel(Parcel.Serialization.BEAN)
public class InvestSection extends InvestmentSection {

    @Override
    public int getItemViewType() {
        return TYPE_INVEST;
    }

}
