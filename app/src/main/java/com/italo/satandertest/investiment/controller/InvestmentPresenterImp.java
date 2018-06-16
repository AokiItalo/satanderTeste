package com.italo.satandertest.investiment.controller;

import com.italo.satandertest.base.BasePresenter;
import com.italo.satandertest.investiment.InvestmentInteractorImpl;
import com.italo.satandertest.investiment.InvestmentView;
import com.italo.satandertest.investiment.OnRequestInvestmentListener;
import com.italo.satandertest.investiment.model.Info;
import com.italo.satandertest.investiment.model.mapper.HeaderMapper;
import com.italo.satandertest.investiment.model.mapper.InfoMapper;
import com.italo.satandertest.investiment.model.mapper.MoreInfoMapper;
import com.italo.satandertest.investiment.model.mapper.RiskMapper;
import com.italo.satandertest.investiment.ui.adapter.section.DowInfoSection;
import com.italo.satandertest.investiment.ui.adapter.section.HeaderSection;
import com.italo.satandertest.investiment.ui.adapter.section.InfoSection;
import com.italo.satandertest.investiment.ui.adapter.section.InvestSection;
import com.italo.satandertest.investiment.ui.adapter.section.InvestmentSection;
import com.italo.satandertest.investiment.ui.adapter.section.MoreInfoSection;
import com.italo.satandertest.investiment.ui.adapter.section.RiskSection;
import com.italo.satandertest.networking.webservices.investiment.InvestmentResponse;
import com.italo.satandertest.networking.webservices.investiment.ScreenResponse;

import java.util.ArrayList;
import java.util.List;


public class InvestmentPresenterImp implements BasePresenter<InvestmentView>, InvestmentPresenter, OnRequestInvestmentListener {

    private InvestmentView mView;
    private InvestmentInteractorImpl mInteractor;

    public InvestmentPresenterImp(InvestmentView view) {
        mView = view;
        mInteractor = new InvestmentInteractorImpl();
    }

    @Override
    public void attachView(InvestmentView view) {
        mView = view;
        mInteractor = new InvestmentInteractorImpl();
    }

    @Override
    public void detachView() {
        mView = null;
    }

    @Override
    public void getFund() {
        mView.showLoading();
        mInteractor.getFund(this);
    }

    @Override
    public void onRequestFundSuccess(InvestmentResponse response) {
        if (mView != null) {
            List<InvestmentSection> investmentSections = getAdapterDataFromResponse(response);
            mView.setInvestmentAdapterData(investmentSections);
            mView.hideLoading();

        }
    }

    private List<InvestmentSection> getAdapterDataFromResponse(InvestmentResponse response) {
        ArrayList<InvestmentSection> investmentSections = new ArrayList<>();
        ScreenResponse screen = response.getScreen();

        HeaderSection headerSection = new HeaderSection(new HeaderMapper().map(screen));
        investmentSections.add(headerSection);

        RiskSection riskSection = new RiskSection(new RiskMapper().map(screen));
        investmentSections.add(riskSection);

        MoreInfoSection moreInfoSection = new MoreInfoSection(new MoreInfoMapper().map(screen));
        investmentSections.add(moreInfoSection);

        List<Info> infos = new InfoMapper().mapInfoList(screen);
        for (Info info : infos) {
            InfoSection infoSection = new InfoSection(info);
            investmentSections.add(infoSection);
        }

        List<Info> dowInfos = new InfoMapper().mapDowInfoList(screen);
        for (Info info : dowInfos) {
            DowInfoSection infoSection = new DowInfoSection(info);
            investmentSections.add(infoSection);
        }

        InvestSection investSection = new InvestSection();
        investmentSections.add(investSection);

        return investmentSections;
    }

    @Override
    public void onRequestFundFailed(int messageResourceId) {
        if (mView != null) {
            mView.showError(messageResourceId);
            mView.hideLoading();
        }
    }
}
