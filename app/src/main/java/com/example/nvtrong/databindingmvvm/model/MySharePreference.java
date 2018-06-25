package com.example.nvtrong.databindingmvvm.model;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.Toast;

import com.example.nvtrong.databindingmvvm.MyApplication;

public class MySharePreference {
    public static final String DATA_SHAREPREFERENCES = "data";
    public static final String USER_NAME = "username";

    public static void setUsername(String username, Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(DATA_SHAREPREFERENCES, Context.MODE_PRIVATE);
        boolean save = sharedPreferences.edit().putString(USER_NAME, username).commit();
        if (save) {
            Toast.makeText(context, "Saved!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(context, "Save Failed!", Toast.LENGTH_SHORT).show();
        }
    }

    public static String getUsername(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(DATA_SHAREPREFERENCES, Context.MODE_PRIVATE);
        return sharedPreferences.getString(USER_NAME, "empty");
    }

}
