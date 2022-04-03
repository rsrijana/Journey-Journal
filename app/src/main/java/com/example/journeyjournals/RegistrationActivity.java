package com.example.journeyjournals;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RegistrationActivity extends AppCompatActivity {
    private EditText name;
    private EditText email;
    private EditText Password;
    private EditText RePassword;
    private Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        initView();
        btnRegister.setOnClickListener(view -> {
            String Name = name.getText().toString();
            String Email = email.getText().toString();
            String Psd = Password.getText().toString();
            String RePsd = RePassword.getText().toString();

            if (name.getText().toString().length()==0) {
                name.setError("Username required");
                name.requestFocus();}

            if (email.getText().toString().length()==0) {
                email.setError("Email");
                email.requestFocus();
            }
            if (Password.getText().toString().length()==0) {
                Password.setError("Password required");
                Password.requestFocus();
            }
            if (RePassword.getText().toString().length()==0)
            {
                RePassword.setError("Confirmed Password");
                RePassword.requestFocus();
            }

            if(!Password.getText().toString().equals(RePassword.getText().toString()))
            {
                RePassword.setError(("Password didn't matched.!"));
                RePassword.requestFocus();

            }
            else if (Name.isEmpty() || Email.isEmpty() || Psd.isEmpty() || RePsd.isEmpty())
            {
                Toast.makeText(RegistrationActivity.this, "Please enter the given fields", Toast.LENGTH_SHORT).show();
            }
            else {
                Toast.makeText(RegistrationActivity.this, "Registration successful", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(RegistrationActivity.this, LoginActivity.class);
                startActivity(i);
            }
        });

        TextView ExistingUser= findViewById(R.id.existingUser);
        ExistingUser.setOnClickListener(view -> {
            Intent i = new Intent(RegistrationActivity.this, LoginActivity.class);
            startActivity(i);
        });
    }
    private void initView(){
        name  = findViewById(R.id.ed_name);
        email = findViewById(R.id.ed_mail);
        Password = findViewById(R.id.ed_password);
        RePassword = findViewById(R.id.ed_retype_password);
        btnRegister = findViewById(R.id.btn_register);
    }
}