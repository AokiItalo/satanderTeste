package com.italo.satandertest.base;


public interface BaseView {

    void showLoading();

    void hideLoading();

    void showError(int messageResourceId);
}
