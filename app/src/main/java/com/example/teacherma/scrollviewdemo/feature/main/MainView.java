package com.example.teacherma.scrollviewdemo.feature.main;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;

import com.example.teacherma.scrollviewdemo.R;
import com.example.teacherma.scrollviewdemo.framework.BaseView;

import java.util.List;

import butterknife.BindView;

public class MainView extends BaseView<MainContract.Presenter> implements MainContract.View {

    @BindView(R.id.rv_refresh)
    RecyclerView mRvRefresh;
    @BindView(R.id.ll_out)
    LinearLayout mLlOut;

    private MainAdapter mAdapter;
    private boolean mCanScrollVertical;
    private int mCurScrollY;
    private int mLastPointerY;

    public MainView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void initView(Context context, AttributeSet attrs, final int defStyleAttr) {
        mCurScrollY = 0;
        mCanScrollVertical = true;
        mLastPointerY = 0;

        mAdapter = new MainAdapter();
        mRvRefresh.setItemAnimator(new DefaultItemAnimator());
        mRvRefresh.setLayoutManager(new LinearLayoutManager(getContext()));
        mRvRefresh.setAdapter(mAdapter);

        mRvRefresh.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);

                if (!recyclerView.canScrollVertically(1)) {
                    mCanScrollVertical = false;
                    return;
                }

                mCanScrollVertical = true;
            }
        });

        mRvRefresh.setOnTouchListener(new OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_MOVE:
                        if(!mCanScrollVertical) {
                            if(0 == mLastPointerY){
                                mLastPointerY = (int) event.getY();
                            }
                            mCurScrollY += mLastPointerY - event.getY();
                            if (mCurScrollY<=0){
                                return false;
                            }
                            mLlOut.scrollTo(mLlOut.getScrollX(), mCurScrollY);
                        }
                        break;
                    case MotionEvent.ACTION_UP:
                        mCurScrollY = 0;
                        mLlOut.scrollTo(0,0);
                        mLastPointerY = 0;
                        mCanScrollVertical = true;
                        break;
                    default:
                        break;
                }
                return !mCanScrollVertical;
            }
        });
    }

    @Override
    protected int getLayoutResId() {
        return R.layout.main_view;
    }

    @Override
    public void loadData(List<String> data) {
        mAdapter.refreshData(data);
    }
}
