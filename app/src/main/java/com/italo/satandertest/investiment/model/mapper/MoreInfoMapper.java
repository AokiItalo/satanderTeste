package com.italo.satandertest.investiment.model.mapper;

import com.italo.satandertest.investiment.model.MoreInfo;
import com.italo.satandertest.investiment.model.MoreInfoDetail;
import com.italo.satandertest.networking.webservices.investiment.MoreInfoDetailResponse;
import com.italo.satandertest.networking.webservices.investiment.ScreenResponse;


public class MoreInfoMapper {

    public MoreInfo map(ScreenResponse screen){

        MoreInfoDetailResponse month = screen.getMoreInfo().getMonth();
        double monthCDI = month.getCDI();
        double monthFund = month.getFund();
        MoreInfoDetail moreInfoMonth = new MoreInfoDetail(monthCDI, monthFund);

        MoreInfoDetailResponse year = screen.getMoreInfo().getMonth();
        double yearCDI = year.getCDI();
        double yearFund = year.getFund();
        MoreInfoDetail moreInfoYear = new MoreInfoDetail(yearCDI, yearFund);

        MoreInfoDetailResponse twelveMonths = screen.getMoreInfo().getMonth();
        double twelveMonthsCDI = twelveMonths.getCDI();
        double twelveMonthsFund = twelveMonths.getFund();
        MoreInfoDetail moreInfoTwelveMonths = new MoreInfoDetail(twelveMonthsCDI, twelveMonthsFund);

        return new MoreInfo(screen.getInfoTitle(), moreInfoMonth, moreInfoYear, moreInfoTwelveMonths);
    }
}
