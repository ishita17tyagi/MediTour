package com.example.meditour;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView nextIn = findViewById(R.id.signIn);

        TextView username = findViewById(R.id.emailTxt);
        TextView password = findViewById(R.id.passTxt);
        Button button = findViewById(R.id.login);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().toString().equals("admin")&&password.getText().toString().equals("admin")){
                    startActivity(new Intent(login.this,MainActivity.class));
                    finish();
                }
                else{
                    Toast.makeText(login.this,"Login Failed",Toast.LENGTH_SHORT).show();
                }
            }
        });
        nextIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(login.this,signup.class));
                finish();
            }
        });

    }
}