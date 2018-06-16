package com.italo.satandertest.investiment.model.mapper;

import com.italo.satandertest.investiment.model.Header;
import com.italo.satandertest.networking.webservices.investiment.ScreenResponse;


public class HeaderMapper {

    public Header map(ScreenResponse screen) {
        return new Header(screen.getTitle(), screen.getFundName(), screen.getWhatIs(), screen.getDefinition());
    }
}
