package com.example.nvtrong.databindingmvvm.model;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class DataModule {
    @Provides
    public DataModel provideDataModel() {
        return new DataModel();
    }
}
