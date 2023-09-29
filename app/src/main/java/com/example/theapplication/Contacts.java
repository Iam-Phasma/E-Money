package com.example.theapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;

public class Contacts extends AppCompatActivity {

    ImageButton ImgbtnContactBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_contacts);

        ImgbtnContactBack = findViewById(R.id.imgbtnContactBack);
        ImgbtnContactBack.setOnClickListener(view -> {

            Intent intent = new Intent(getApplicationContext(), Home.class);
            startActivity(intent);

        });
    }
}