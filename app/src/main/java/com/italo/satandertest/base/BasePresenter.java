package com.italo.satandertest.base;



public interface BasePresenter<V> {

    void attachView(V view);

    void detachView();

}
