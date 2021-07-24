package com.ashwin.appone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.ashwin.libone.LibOne;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView dataTextView = findViewById(R.id.data_text_view);

        String libClientId = LibOne.getClientId();
        String appClientId = BuildConfig.CLIENT_ID;
        String libStrRes = LibOne.getStrRes(getApplicationContext());
        String appStrRes = getString(R.string.str_one);
        //dataTextView.setText("lib: " + libStrRes + ", app: " + appStrRes);  // Same as in app-one
        dataTextView.setText("lib: " + libClientId + ", app: " + appClientId);  // Different
    }
}
