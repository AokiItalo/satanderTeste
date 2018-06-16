package com.italo.satandertest.investiment.ui.adapter.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.italo.satandertest.R;
import com.italo.satandertest.investiment.model.Info;

import butterknife.BindView;
import butterknife.ButterKnife;


public class InfoViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id. text_view_name)
    TextView mTextViewName;
    @BindView(R.id.        text_view_value)
    TextView mTextViewValue;


    public InfoViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    public void bindInfo(Info info){
        mTextViewName.setText(info.getName());
        mTextViewValue.setText(info.getData());
    }
}
