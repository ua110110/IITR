package com.example.iitroorkee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Activity20 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_20);
    }
    public void menu4(View view){
        Intent i = new Intent(this,Activity18.class);
        startActivity(i);
    }
}
