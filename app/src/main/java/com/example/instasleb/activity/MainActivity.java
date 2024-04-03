package com.example.instasleb.activity;

import android.os.Bundle;

import com.example.instasleb.databinding.ActivityMainBinding;

public class MainActivity extends BaseActivity {
    private ActivityMainBinding mainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mainBinding.getRoot());

    }
}