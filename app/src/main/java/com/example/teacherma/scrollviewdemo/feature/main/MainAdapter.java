package com.example.teacherma.scrollviewdemo.feature.main;

import android.content.Context;
import android.view.ViewGroup;

import com.example.teacherma.scrollviewdemo.framework.BaseAdapter;
import com.example.teacherma.scrollviewdemo.framework.BaseViewHolder;

public class MainAdapter extends BaseAdapter<String> {
    @Override
    protected BaseViewHolder createViewHolder(Context context, ViewGroup parent) {
        return new MainVH(context, parent);
    }
}
