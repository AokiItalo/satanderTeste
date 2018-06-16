package com.italo.satandertest.investiment.ui.adapter.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.italo.satandertest.R;
import com.italo.satandertest.investiment.model.MoreInfo;
import com.italo.satandertest.util.StringUtils;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MoreInfoViewHolder extends RecyclerView.ViewHolder {


    @BindView(R.id.text_view_title)
    TextView mTextViewTitle;
    @BindView(R.id.text_view_month_fund)
    TextView mTextViewMonthFund;
    @BindView(R.id.text_view_month_cdi)
    TextView mTextViewMonthCDI;
    @BindView(R.id.text_view_year_fund)
    TextView mTextViewYearFund;
    @BindView(R.id.text_view_year_cdi)
    TextView mTextViewYearCDI;
    @BindView(R.id.text_view_twelve_months_fund)
    TextView mTextViewTwelveMonthsFund;
    @BindView(R.id.text_view_twelve_months_cdi)
    TextView mTextViewTwelveMonthsCDI;

    public MoreInfoViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    public void bindMoreInfo(MoreInfo moreInfo) {
        mTextViewTitle.setText(moreInfo.getInfoTitle());
        mTextViewMonthFund.setText(StringUtils.getFormattedPercentage(moreInfo.getMoreInfoMonth().getFund()));
        mTextViewMonthCDI.setText(StringUtils.getFormattedPercentage(moreInfo.getMoreInfoMonth().getCDI()));
        mTextViewYearFund.setText(StringUtils.getFormattedPercentage(moreInfo.getMoreInfoYear().getFund()));
        mTextViewYearCDI.setText(StringUtils.getFormattedPercentage(moreInfo.getMoreInfoYear().getCDI()));
        mTextViewTwelveMonthsFund.setText(StringUtils.getFormattedPercentage(moreInfo.getMoreInfoTwelveMonths().getFund()));
        mTextViewTwelveMonthsCDI.setText(StringUtils.getFormattedPercentage(moreInfo.getMoreInfoTwelveMonths().getCDI()));


    }
}
