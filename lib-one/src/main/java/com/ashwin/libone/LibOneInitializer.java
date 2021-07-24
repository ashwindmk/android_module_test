package com.ashwin.libone;

import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.startup.Initializer;

import java.util.Collections;
import java.util.List;

public class LibOneInitializer implements Initializer<String> {
    @NonNull
    @Override
    public String create(@NonNull Context context) {
        Log.d("module-test", "LibOneInitializer: create");
        LibApplication.initialize("", "");
        return "null";
    }

    @NonNull
    @Override
    public List<Class<? extends Initializer<?>>> dependencies() {
        Log.d("module-test", "LibOneInitializer: dependencies");
        return Collections.emptyList();
    }
}
