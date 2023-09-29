package com.example.theapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class Signup extends AppCompatActivity {

    TextView TvJoinedBefore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_signup);

        TvJoinedBefore = findViewById(R.id.tvJoinedBefore);
        TvJoinedBefore.setOnClickListener(view -> {

            Intent intent = new Intent(getApplicationContext(), Login.class);
            startActivity(intent);

        });
    }
}