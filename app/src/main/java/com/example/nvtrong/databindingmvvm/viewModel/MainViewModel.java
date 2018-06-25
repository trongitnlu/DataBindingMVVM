package com.example.nvtrong.databindingmvvm.viewModel;

import android.content.Context;
import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.ObservableField;

import com.example.nvtrong.databindingmvvm.model.MySharePreference;


public class MainViewModel extends BaseObservable {
    public ObservableField<String> nameUser = new ObservableField<>("name");
    public ObservableField<String> stringSave = new ObservableField<>("empty");

    public Context context;

    public MainViewModel(Context context) {
        this.context = context;
    }

    @Bindable
    public String ageUser = "0";

    public void setNameUser(String nameUser) {
        this.nameUser.set(nameUser);
    }

    public void setAgeUser(String ageUser) {
        this.ageUser = ageUser;
        notifyChange();
    }

    public void increaseAge() {
        String age = String.valueOf(Integer.parseInt(ageUser) + 1);
        setAgeUser(age);
    }

    public void saveUsernameSharePreference() {
        MySharePreference.setUsername(nameUser.get(), context);
    }

    public void getUsernameSharePreference() {
        stringSave.set(MySharePreference.getUsername(context));
    }
}
