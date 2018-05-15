package com.tawambo.creative.dance254;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.crashlytics.android.Crashlytics;
import com.crashlytics.android.answers.Answers;

import io.fabric.sdk.android.Fabric;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Initialize Crashlytics Kit
        Fabric.with(this, new Crashlytics());

        // Initialize Answers Kit
        Fabric.with(this, new Answers());
        setContentView(R.layout.activity_main);
    }
}
