package com.example.welcometostorymation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Creation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creation);
    }
    public void btnBack(View view) {
        Intent intent = new Intent(this,MainPage.class);
        startActivity(intent);
    }
    public void btnsystem_creation(View view) {
        Intent intent = new Intent(this,system_creation.class);
        startActivity(intent);
    }
}