package com.example.teacherma.scrollviewdemo;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;


public class App extends Application {

    @SuppressLint("StaticFieldLeak")
    private static Context mContext = null;

    public static Context getAppContext() {
        return mContext;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();
    }
}
