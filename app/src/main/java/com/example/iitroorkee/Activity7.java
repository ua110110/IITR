package com.example.iitroorkee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Activity7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_7);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void menu(View view){
        Intent i = new Intent(this,Activity10.class);
        startActivity(i);
    }
}
