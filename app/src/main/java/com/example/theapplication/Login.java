package com.example.theapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    ImageButton BtnLogin;
    TextView TvRegister;
    EditText EditTxtEmailIDLogin;
    EditText EditTxtPinLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_login);

        EditTxtEmailIDLogin = findViewById(R.id.edittxtEmailIDLogin);
        EditTxtPinLogin = findViewById(R.id.editTxtPinLogin);

        BtnLogin = findViewById(R.id.imbutLogin);
        BtnLogin.setOnClickListener(view -> {

            String inputedEmail = EditTxtEmailIDLogin.getText().toString().trim();
            String inputedPin = EditTxtEmailIDLogin.getText().toString().trim();

            if (inputedEmail.isEmpty() || inputedPin.isEmpty()){
                Toast.makeText(getApplicationContext(), "No input", Toast.LENGTH_LONG).show();
            }else {

                Intent intent = new Intent(getApplicationContext(), Home.class);
                startActivity(intent);
            }
        });

        TvRegister = findViewById(R.id.tvRegister);
        TvRegister.setOnClickListener(view -> {

            Intent intent = new Intent(getApplicationContext(), Signup.class);
            startActivity(intent);

        });
    }
}