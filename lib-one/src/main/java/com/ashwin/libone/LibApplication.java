package com.ashwin.libone;

import android.app.Application;
import android.util.Log;

public class LibApplication extends Application {
    private static String CLIENT_ID = "";
    private static String CLIENT_SECRET = "";

    public static void initialize(String clientId, String clientSecret) {
        CLIENT_ID = clientId;
        CLIENT_SECRET = clientSecret;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("module-test", "LibApplication: str-res: " + this.getString(R.string.str_one));  // App One
        Log.d("module-test", "LibApplication: str-res: " + BuildConfig.CLIENT_ID);
    }
}
