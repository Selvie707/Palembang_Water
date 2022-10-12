package com.example.palembangwater;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivityy extends AppCompatActivity {

    private TextView tvnama, tvnegara, tvemail;
    private Button btn_logOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_activityy);

        tvnama = findViewById(R.id.tv_nama);
        tvnegara = findViewById(R.id.tv_negara);
        tvemail = findViewById(R.id.tv_email);
        btn_logOut = findViewById(R.id.btn_logOut);

        Intent intent = getIntent();
        tvnama.setText(intent.getStringExtra("varName"));
        tvnegara.setText(intent.getStringExtra("varNegara"));
        tvemail.setText(intent.getStringExtra("varEmail"));

        btn_logOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ResultActivityy.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}