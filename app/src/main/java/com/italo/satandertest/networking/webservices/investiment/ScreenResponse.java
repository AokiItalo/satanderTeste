package com.italo.satandertest.networking.webservices.investiment;

import com.italo.satandertest.investiment.model.RiskEnum;

import java.util.List;

public class ScreenResponse {

    private String title;
    private String fundName;
    private String whatIs;
    private String definition;
    private String riskTitle;
    private RiskEnum risk;
    private String infoTitle;
    private MoreInfoResponse moreInfo;
    private List<InfoResponse> info;
    private List<InfoResponse> downInfo;

    public String getTitle() {
        return title;
    }

    public String getFundName() {
        return fundName;
    }

    public String getWhatIs() {
        return whatIs;
    }

    public String getDefinition() {
        return definition;
    }

    public String getRiskTitle() {
        return riskTitle;
    }

    public RiskEnum getRisk() {
        return risk;
    }

    public String getInfoTitle() {
        return infoTitle;
    }

    public MoreInfoResponse getMoreInfo() {
        return moreInfo;
    }

    public List<InfoResponse> getInfo() {
        return info;
    }

    public List<InfoResponse> getDownInfo() {
        return downInfo;
    }

}
