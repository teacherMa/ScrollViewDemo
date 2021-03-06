package com.example.teacherma.scrollviewdemo.model.main.remote;

import com.example.teacherma.scrollviewdemo.model.main.MainDataSource;

public class MainRemoteDS implements MainDataSource {
    private MainRemoteDS() {
    }

    public static MainRemoteDS getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final MainRemoteDS INSTANCE = new MainRemoteDS();
    }
}
