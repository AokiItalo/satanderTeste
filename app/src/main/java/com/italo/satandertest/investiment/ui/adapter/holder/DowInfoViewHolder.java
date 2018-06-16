package com.italo.satandertest.investiment.ui.adapter.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.italo.satandertest.R;
import com.italo.satandertest.investiment.model.Info;

import butterknife.BindView;
import butterknife.ButterKnife;


public class DowInfoViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.text_view_name)
    TextView mTextViewName;
    @BindView(R.id.linear_download)
    LinearLayout mLinearLayoutDownload;


    public DowInfoViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    public void bindDowInfo(Info info){
        mTextViewName.setText(info.getName());
        mLinearLayoutDownload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(itemView.getContext(), R.string.message_unavailable, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
