package com.gvtechcom.myapplication;

import android.app.Application;

import com.microsoft.appcenter.distribute.Distribute;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Distribute.setEnabled(true);
        Distribute.checkForUpdate();
    }
}
