package com.example.journeyjournals;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    private final static String tag = "LoginActivity";  //set variable below
    private EditText eEmail;
    private EditText ePassword;
    private Button eLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initViews();
        assignButtonAction();

        eLogin.setOnClickListener(view -> { // changed to Lambda expression//
            String inputEmail = eEmail.getText().toString();
            String inputPassword = ePassword.getText().toString();

            // trim eliminates space in email/password fields//
            if (eEmail.getText().toString().equals("srijana@ismt.edu.np") && ePassword.getText().toString().equals("12345")) {
                Toast.makeText(LoginActivity.this, "login successfully", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(LoginActivity.this, DashboardActivity.class);
                startActivity(i);
            } else if (inputEmail.isEmpty() || inputPassword.isEmpty()) {
                Toast.makeText(LoginActivity.this, "Please enter the given field..!!", Toast.LENGTH_SHORT).show();
                eEmail.setError("Email");
                eEmail.requestFocus();
                ePassword.setError("Password");
                ePassword.requestFocus();
            } else {
                Toast.makeText(LoginActivity.this, "invalid email or password", Toast.LENGTH_SHORT).show();

            }

        });
        TextView newUser = findViewById(R.id.register_Link);
        newUser.setOnClickListener(view -> {
            Intent i = new Intent(LoginActivity.this,   RegistrationActivity.class);
            startActivity(i);
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(tag, "onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(tag, "onResume: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(tag, "onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(tag, "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(tag, "onDestroy: ");
    }

    private void initViews() {
        eEmail = findViewById(R.id.ed_email);
        ePassword = findViewById(R.id.ed_password);
        eLogin = findViewById(R.id.btn_login);
    }

    private void assignButtonAction() {
        //Lambda expression is added here
        eLogin.setOnClickListener(view -> Log.d(tag, "assignButtonAction: single click"));
        eLogin.setOnLongClickListener(view -> {
            Log.d(tag, "assignButtonAction: long click");
            return true;
        });
    }
}