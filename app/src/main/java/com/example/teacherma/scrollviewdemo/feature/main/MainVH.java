package com.example.teacherma.scrollviewdemo.feature.main;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.teacherma.scrollviewdemo.R;
import com.example.teacherma.scrollviewdemo.api.OnItemClickListener;
import com.example.teacherma.scrollviewdemo.framework.BaseViewHolder;

import butterknife.BindView;

public class MainVH extends BaseViewHolder<String> {

    @BindView(R.id.tv_user_name)
    TextView mTvUserName;

    public MainVH(Context context, ViewGroup root) {
        super(context, root, R.layout.rv_item);
    }

    @Override
    protected void bindData(String itemValue, int position, OnItemClickListener listener) {
        mTvUserName.setText(itemValue);
    }
}
