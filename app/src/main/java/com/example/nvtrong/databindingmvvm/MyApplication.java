package com.example.nvtrong.databindingmvvm;

import android.app.Activity;
import android.app.Application;

import com.example.nvtrong.databindingmvvm.di.component.DaggerAppComponent;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

public class MyApplication extends Application implements HasActivityInjector {
    private static MyApplication application = new MyApplication();
    // Used for injecting Activities
    @Inject
    DispatchingAndroidInjector<Activity> dispatchingActivityInjector;

    public static MyApplication getApplication() {
        return application;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        DaggerAppComponent.builder()
                .application(this)
                .build()
                .inject(this);
    }


    @Override
    public AndroidInjector<Activity> activityInjector() {
        return dispatchingActivityInjector;
    }
}
