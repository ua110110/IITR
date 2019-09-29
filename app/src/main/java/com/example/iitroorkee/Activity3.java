package com.example.iitroorkee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Activity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void rajendra(View view){
        Intent i = new Intent(this,Activity13.class);
        startActivity(i);
    }
    public void rajiv(View view){
        Intent j = new Intent(this,Activity14.class);
        startActivity(j);
    }
    public void cautley(View view) {
        Intent k = new Intent(this, Activity15.class);
        startActivity(k);
    }
    public void sarojini(View view) {
        Intent l = new Intent(this, Activity16.class);
        startActivity(l);
    }


}
