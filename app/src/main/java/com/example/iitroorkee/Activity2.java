package com.example.iitroorkee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void rajiv(View view){
        Intent i = new Intent(this,Activity7.class);
        startActivity(i);
    }
    public void rajendra(View view){
        Intent j = new Intent(this,Activity8.class);
        startActivity(j);
    }
    public void cautley(View view){
        Intent k = new Intent(this,Activity9.class);
        startActivity(k);
    }
    public void gc(View view){
        Intent l = new Intent(this,Activity20.class);
        startActivity(l);
    }
}
