package com.example.theapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;

public class Transactions extends AppCompatActivity {

    ImageButton ImgbtnTrasactionsBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_transactions);

        ImgbtnTrasactionsBack = findViewById(R.id.imgbtnTrasactionsBack);
        ImgbtnTrasactionsBack.setOnClickListener(view -> {

            Intent intent = new Intent(getApplicationContext(), Home.class);
            startActivity(intent);

        });
    }
}