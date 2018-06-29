package com.example.nvtrong.databindingmvvm.di.builder;

import com.example.nvtrong.databindingmvvm.MainActivity;
import com.example.nvtrong.databindingmvvm.model.DataModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuilder {
    @ContributesAndroidInjector(modules = {DataModule.class})
    abstract MainActivity bindMainActivity();


}
