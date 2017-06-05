package com.example.teacherma.scrollviewdemo.utils;

import com.example.teacherma.scrollviewdemo.model.main.MainRepository;
import com.example.teacherma.scrollviewdemo.model.main.local.MainLocalDS;
import com.example.teacherma.scrollviewdemo.model.main.remote.MainRemoteDS;

/**
 * Inject repository .
 * <p>
 */

public class Injection {

    public static MainRepository provideMainRepository(){
        return MainRepository.getInstance(
                MainLocalDS.getInstance(),
                MainRemoteDS.getInstance()
        );
    }

}
