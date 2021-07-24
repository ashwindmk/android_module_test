package com.ashwin.libone;

import android.content.Context;

public class LibOne {
    public static String getData() {
        return BuildConfig.CLIENT_ID;
    }

    public static String getClientId() {
        return BuildConfig.CLIENT_ID;
    }

    public static String getStrRes(Context context) {
        return context.getString(R.string.str_one);
    }
}
