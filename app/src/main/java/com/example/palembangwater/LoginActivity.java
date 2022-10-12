package com.example.palembangwater;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText et_nama, et_password;
    Button btn_logIn, btn_signUp;
    String nama, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        et_nama = findViewById(R.id.et_usernameLogin);
        et_password = findViewById(R.id.et_passwordLogin);

        btn_logIn = findViewById(R.id.btn_loginLogin);
        btn_signUp = findViewById(R.id.btn_SignUpLogin);

        nama = et_nama.getText().toString();
        password = et_password.getText().toString();

        btn_logIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (nama.equals(""))
                {
                    et_nama.setError("Nama harus diisi");
                }
                else if (password.trim().equals(""))
                {
                    et_password.setError("Password harus diisi");
                }
                else
                {
                    Toast.makeText(LoginActivity.this, "Anda Sudah Terdaftar !", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btn_signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });
    }
}