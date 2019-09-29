package com.example.iitroorkee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Activity9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_9);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void menu2(View view) {
        Intent i = new Intent(this, Activity12.class);
        startActivity(i);
    }
}
