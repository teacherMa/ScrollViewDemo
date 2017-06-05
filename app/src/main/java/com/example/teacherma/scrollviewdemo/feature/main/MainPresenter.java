package com.example.teacherma.scrollviewdemo.feature.main;

import android.support.annotation.NonNull;

import com.example.teacherma.scrollviewdemo.framework.BasePresenter;
import com.example.teacherma.scrollviewdemo.model.main.MainRepository;

import java.util.ArrayList;
import java.util.List;

public class MainPresenter extends BasePresenter<MainContract.View, MainRepository> implements MainContract.Presenter {

    public MainPresenter(@NonNull MainRepository repository, @NonNull MainContract.View view) {
        super(repository, view);
    }

    @Override
    public void start() {
        getData();
    }

    @Override
    public void getData() {
        List<String> data = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            data.add(Integer.toString(i));
        }
        getView().loadData(data);
    }
}
