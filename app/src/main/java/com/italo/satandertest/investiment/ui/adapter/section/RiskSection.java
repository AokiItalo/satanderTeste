package com.italo.satandertest.investiment.ui.adapter.section;

import com.italo.satandertest.investiment.model.Risk;

import org.parceler.Parcel;
import org.parceler.ParcelConstructor;


@Parcel(Parcel.Serialization.BEAN)
public class RiskSection extends InvestmentSection{

    private Risk mRisk;

    @ParcelConstructor
    public RiskSection(Risk risk) {
        this.mRisk = risk;
    }

    public Risk getRisk() {
        return mRisk;
    }

    @Override
    public int getItemViewType() {
        return TYPE_RISK;
    }


}
