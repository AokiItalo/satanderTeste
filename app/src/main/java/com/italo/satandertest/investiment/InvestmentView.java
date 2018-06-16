package com.italo.satandertest.investiment;

import com.italo.satandertest.base.BaseView;
import com.italo.satandertest.investiment.ui.adapter.section.InvestmentSection;

import java.util.List;

public interface InvestmentView extends BaseView {


    void setInvestmentAdapterData(List<InvestmentSection> data);
}
