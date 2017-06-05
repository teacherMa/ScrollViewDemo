package com.example.teacherma.scrollviewdemo.custom.view;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * Created by teacherMa on 2017/6/3.
 * A RecyclerView that support up drag loading more and down drag to fresh UI
 */

public class DragRecyclerView extends RecyclerView {

    public DragRecyclerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onTouchEvent(MotionEvent e) {
        return super.onTouchEvent(e);
    }
}
