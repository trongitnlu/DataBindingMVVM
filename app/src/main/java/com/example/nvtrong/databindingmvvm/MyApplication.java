package com.example.nvtrong.databindingmvvm;

import android.app.Application;
import android.os.Bundle;

public class MyApplication extends Application {
    private static MyApplication application = new MyApplication();

    public static MyApplication getApplication() {
        return application;
    }

}
