package com.italo.satandertest.contact.ui.custom;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v4.content.ContextCompat;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.view.ViewGroup;

import com.italo.satandertest.R;
import com.italo.satandertest.contact.model.Cell;
import com.italo.satandertest.util.DimensUtil;


public class CustomButton extends AppCompatButton implements CustomViewInterface {

    private Cell mCell;

    public CustomButton(Context context, Cell cell, final OnSendClickListener listener) {
        super(context);
        mCell = cell;
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        setTextColor(ContextCompat.getColor(getContext(), R.color.white));
        setSupportAllCaps(false);
        setBackground(ContextCompat.getDrawable(getContext(), R.drawable.background_button_selector));
        setTopMargin(marginLayoutParams);
        setMessage(mCell.getMessage());
        setVisibility();

        Typeface typeface = ResourcesCompat.getFont(context, R.font.din_pro_medium);
        setTypeface(typeface);

        setLayoutParams(marginLayoutParams);

        setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onSendClick();
            }
        });

    }

    @Override
    public void setTopMargin(ViewGroup.MarginLayoutParams layoutParams) {
        layoutParams.topMargin = DimensUtil.dpToPx(getContext(), mCell.getTopSpacing());
        layoutParams.setMarginStart(DimensUtil.dpToPx(getContext(), 24));
        layoutParams.setMarginEnd(DimensUtil.dpToPx(getContext(), 24));
        layoutParams.bottomMargin = DimensUtil.dpToPx(getContext(), 24);

    }

    @Override
    public void setMessage(String message) {
        setText(message);
    }

    @Override
    public void setVisibility() {
        setVisibility(mCell.isHidden() ? GONE : VISIBLE);
    }

    @Override
    public boolean isRequired() {
        return mCell.isRequired();
    }

    @Override
    public void setRequired(boolean isRequired) {

    }

    @Override
    public boolean checkError() {
        return false;
    }

    @Override
    public void clearField() {

    }

    public interface OnSendClickListener{
        void onSendClick();
    }
}
