package com.example.palembangwater;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class RegisterActivity extends AppCompatActivity {

    EditText et_nama, et_email, et_password, et_confirmPassword;
    Button btn_signUp;
    Spinner sp_negara;
    String nama, negara, email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        et_nama = findViewById(R.id.et_usernamenamename);
        et_email = findViewById(R.id.et_emailRegister);
        et_password = findViewById(R.id.et_passwordRegister);
        et_confirmPassword = findViewById(R.id.et_confirmPassword);
        sp_negara = findViewById(R.id.sp_negara);
        btn_signUp = findViewById(R.id.btn_SignUpRegister);

        btn_signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nama = et_nama.getText().toString();
                negara = sp_negara.getSelectedItem().toString();
                email = et_email.getText().toString();

                if (nama.equals(""))
                {
                    et_nama.setError("Nama tidak boleh kosong");
                }
                else if (email.trim().equals(""))
                {
                    et_email.setError("Email tidak boleh kosong");
                }
                else
                {
                    Intent intent = new Intent(RegisterActivity.this, ResultActivityy.class);
                    intent.putExtra("VarName", nama);
                    intent.putExtra("varNegara", negara);
                    intent.putExtra("varEmail", email);
                    startActivity(intent);
                }
            };
        });
    }
}