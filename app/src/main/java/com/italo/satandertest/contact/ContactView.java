package com.italo.satandertest.contact;

import com.italo.satandertest.base.BaseView;
import com.italo.satandertest.contact.model.Cell;


public interface ContactView extends BaseView {

    void addTextView(Cell cell);

    void addEditText(Cell cell);

    void addCheckbox(Cell cell);

    void addButton(Cell cell);

    void addImage(Cell cell);

    void showSuccessScreen();

    void setSavedValues();
}
