package com.example.welcometostorymation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnSign_up(View view) {
        Intent intent = new Intent(this,sign_up.class);
        startActivity(intent);
    }

    public void btnSign_in(View view) {
        Intent intent = new Intent(this,sign_in.class);
        startActivity(intent);
    }

}