package com.example.instasleb.activity;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.util.DisplayMetrics;

import androidx.appcompat.app.AppCompatActivity;

public class BaseActivity extends AppCompatActivity {
    //All activities that extend this class should remain unaffected
    // by changes in screen zoom settings.
    @Override
    protected void attachBaseContext(Context baseContext) {
        Context newContext;

        DisplayMetrics displayMetrics = baseContext.getResources().getDisplayMetrics();
        Configuration configuration = baseContext.getResources().getConfiguration();

        if (displayMetrics.densityDpi != DisplayMetrics.DENSITY_DEVICE_STABLE) {
            configuration.densityDpi = DisplayMetrics.DENSITY_DEVICE_STABLE;
            newContext = baseContext.createConfigurationContext(configuration);
        } else {
            newContext = baseContext;
        }
        super.attachBaseContext(newContext);
    }
}
