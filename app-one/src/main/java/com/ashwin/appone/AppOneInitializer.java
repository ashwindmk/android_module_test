package com.ashwin.appone;

import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.startup.Initializer;

import com.ashwin.libone.LibOneInitializer;

import java.util.Collections;
import java.util.List;

public class AppOneInitializer implements Initializer {
    @NonNull
    @Override
    public Object create(@NonNull Context context) {
        Log.d("module-test", "AppOneInitializer: create");
        return "null";
    }

    @NonNull
    @Override
    public List<Class<? extends Initializer<?>>> dependencies() {
        Log.d("module-test", "AppOneInitializer: dependencies");
        return Collections.singletonList(LibOneInitializer.class);
    }
}
