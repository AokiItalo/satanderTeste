package com.italo.satandertest.investiment.ui.adapter.section;

public abstract class InvestmentSection{

    public static final int TYPE_HEADER = 0;
    public static final int TYPE_RISK = 1;
    public static final int TYPE_MORE_INFO = 2;
    public static final int TYPE_INFO = 3;
    public static final int TYPE_DOW_INFO = 4;
    public static final int TYPE_INVEST = 5;

    public abstract int getItemViewType();
}
