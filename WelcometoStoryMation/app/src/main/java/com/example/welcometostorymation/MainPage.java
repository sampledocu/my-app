package com.example.welcometostorymation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
    }

    public void btnCreate_new_creation(View view) {
        Intent intent = new Intent(this, Creation.class);
        startActivity(intent);
    }


    public void btnBack(View view) {
        Intent intent = new Intent(this, Menu.class);
        startActivity(intent);
    }

    public void btnmy_creation(View view) {
        Intent intent = new Intent(this, my_creation.class);
        startActivity(intent);
    }
}