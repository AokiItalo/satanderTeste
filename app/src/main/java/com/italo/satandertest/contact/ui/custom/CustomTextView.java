package com.italo.satandertest.contact.ui.custom;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.view.ViewGroup;

import com.italo.satandertest.R;
import com.italo.satandertest.contact.model.Cell;
import com.italo.satandertest.util.DimensUtil;


public class CustomTextView extends AppCompatTextView  implements CustomViewInterface{

    private final Cell mCell;

    public CustomTextView(Context context, Cell cell) {
        super(context);
        mCell = cell;

        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        setTopMargin(marginLayoutParams);

        setMessage(cell.getMessage());
        setVisibility();
        setTextSize(15);
        Typeface typeface = ResourcesCompat.getFont(context, R.font.din_pro_medium);
        setTypeface(typeface);

        setLayoutParams(marginLayoutParams);


    }

    public CustomTextView(Context context, AttributeSet attrs, Cell mCell) {
        super(context, attrs);
        this.mCell = mCell;
    }

    public CustomTextView(Context context, AttributeSet attrs, int defStyleAttr, Cell mCell) {
        super(context, attrs, defStyleAttr);
        this.mCell = mCell;
    }

    @Override
    public void setTopMargin(ViewGroup.MarginLayoutParams layoutParams) {
        layoutParams.topMargin = DimensUtil.dpToPx(getContext(), mCell.getTopSpacing());
        layoutParams.setMarginStart(DimensUtil.dpToPx(getContext(), 24));
        layoutParams.setMarginEnd(DimensUtil.dpToPx(getContext(), 24));
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
}
