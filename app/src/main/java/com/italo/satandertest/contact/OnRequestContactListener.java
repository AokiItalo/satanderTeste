package com.italo.satandertest.contact;

import com.italo.satandertest.networking.webservices.contact.CellsResponse;


public interface OnRequestContactListener {

    void onRequestContactSuccess(CellsResponse response);

    void onRequestContactFailed(int messageResourceId);
}
