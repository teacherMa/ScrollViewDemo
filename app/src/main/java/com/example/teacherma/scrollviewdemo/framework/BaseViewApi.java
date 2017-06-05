package com.example.teacherma.scrollviewdemo.framework;

public interface BaseViewApi<T extends BasePresenterApi> {

    void setPresenter(T presenter);

    boolean isActive();
}
