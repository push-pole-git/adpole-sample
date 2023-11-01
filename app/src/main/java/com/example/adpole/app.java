package com.example.adpole;

import android.app.Application;

import com.adpole.sdk.AdPole;
import com.adpole.sdk.InterstitialActivity;

public class app extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        AdPole.initialize(this, "Your_AdPoleAppId");
        InterstitialActivity.init(this);
        InterstitialActivity.loadAd();
    }
}
