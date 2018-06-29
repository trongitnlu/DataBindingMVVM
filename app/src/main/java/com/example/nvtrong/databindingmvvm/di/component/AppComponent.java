package com.example.nvtrong.databindingmvvm.di.component;

import android.app.Application;

import com.example.nvtrong.databindingmvvm.MyApplication;
import com.example.nvtrong.databindingmvvm.di.builder.ActivityBuilder;
import com.example.nvtrong.databindingmvvm.di.module.AppModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(modules = {AndroidSupportInjectionModule.class, AppModule.class, ActivityBuilder.class})
public interface AppComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }

    void inject(MyApplication application);
}
