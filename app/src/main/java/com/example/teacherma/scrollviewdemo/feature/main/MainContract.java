package com.example.teacherma.scrollviewdemo.feature.main;

import com.example.teacherma.scrollviewdemo.framework.BasePresenterApi;
import com.example.teacherma.scrollviewdemo.framework.BaseViewApi;

import java.util.List;

public class MainContract {

    interface View extends BaseViewApi<Presenter> {
        void loadData(List<String> data);
    }

    interface Presenter extends BasePresenterApi {
        void getData();
    }
}
