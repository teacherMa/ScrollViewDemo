package com.example.teacherma.scrollviewdemo.api;

public interface OnResultCallback<T> {

    void onSuccess(T resultValue, int code);

    void onFail(String errorMessage);
}
