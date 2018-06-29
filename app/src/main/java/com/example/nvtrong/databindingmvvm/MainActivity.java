package com.example.nvtrong.databindingmvvm;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.nvtrong.databindingmvvm.databinding.ActivityMainBinding;
import com.example.nvtrong.databindingmvvm.model.DataModel;
import com.example.nvtrong.databindingmvvm.model.DataModule;
import com.example.nvtrong.databindingmvvm.viewModel.MainViewModel;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;
import dagger.android.support.HasSupportFragmentInjector;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    MainViewModel viewModel;
    @Inject
    DataModel dataModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        viewModel = new MainViewModel(this);
        binding.setViewModel(viewModel);
        AndroidInjection.inject(this);
        Log.d("1111111111", dataModel.toString());
    }
}
