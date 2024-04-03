package com.example.instasleb.activity;

import android.app.Application;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //for the best practices i added this file because
        // It's instantiated before any other Android component
        // (like activities, services, or broadcast receivers) and
        // exists throughout the entire lifecycle of the application.
        // This makes it suitable for storing and managing global data
        // and resources.

    }
}
