package com.tawambo.creative.dance254;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

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

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_news:
                        Toast.makeText(MainActivity.this, "News", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.action_events:
                        Toast.makeText(MainActivity.this, "Favorites", Toast.LENGTH_SHORT).show();
                        break;
//                    case R.id.action_nearby:
//                        Toast.makeText(MainActivity.this, "Nearby", Toast.LENGTH_SHORT).show();
//                        break;
                }
                return true;
            }
        });
    }
}
