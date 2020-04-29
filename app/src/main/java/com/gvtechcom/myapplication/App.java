package com.gvtechcom.myapplication;

import android.app.Application;

import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;
import com.microsoft.appcenter.distribute.Distribute;
import com.microsoft.appcenter.distribute.UpdateTrack;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Distribute.setEnabled(true);
        Distribute.setUpdateTrack(UpdateTrack.PRIVATE);
        Distribute.checkForUpdate();
        AppCenter.start(this, "aec2c7a9-65fa-4f64-a151-ffe9004d73a9",
                Distribute.class, Analytics.class, Crashes.class);
    }
}
