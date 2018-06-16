package com.italo.satandertest.contact.ui.custom;

import android.view.ViewGroup;


public interface CustomViewInterface {

    void setTopMargin(ViewGroup.MarginLayoutParams layoutParams);

    void setMessage(String message);

    void setVisibility();

    boolean isRequired();

    void setRequired(boolean isRequired);

    boolean checkError();

    void clearField();
}
