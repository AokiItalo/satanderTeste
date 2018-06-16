package com.italo.satandertest.investiment.model.mapper;

import com.italo.satandertest.investiment.model.Risk;
import com.italo.satandertest.networking.webservices.investiment.ScreenResponse;


public class RiskMapper {

    public Risk map(ScreenResponse screen) {
        return new Risk(screen.getRiskTitle(), screen.getRisk().risk);
    }
}
