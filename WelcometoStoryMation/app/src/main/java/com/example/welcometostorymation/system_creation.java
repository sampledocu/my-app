package com.example.welcometostorymation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class system_creation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_system_creation);
    }
    public void btnBack2(View view) {
        Intent intent = new Intent(this,Creation.class);
        startActivity(intent);
    }
}