package com.example.android.healthylife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button about;
    Button profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button about = findViewById(R.id.about);
        Button profile = findViewById(R.id.profile);


    }

    public void about(View view) {
        Intent abt = new Intent(MainActivity.this , about.class);
        startActivity(abt);
    }

    public void profile(View view) {
        Intent pro = new Intent(MainActivity.this, profile.class );
        startActivity(pro);
    }
}
