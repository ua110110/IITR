package com.example.iitroorkee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Activity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void ccd(View view) {
        Intent i = new Intent(this, Activity19.class);
        startActivity(i);
    }
    public void brishaa(View view) {
        Intent j = new Intent(this, Activity17.class);
        startActivity(j);
    }
    public void salon1(View view) {
        Intent k = new Intent(this, Activity21.class);
        startActivity(k);
    }
    public void salon2(View view) {
        Intent l = new Intent(this, Activity22.class);
        startActivity(l);
    }
    public void res1(View view) {
        Intent m = new Intent(this, Activity23.class);
        startActivity(m);
    }
    public void res2(View view) {
        Intent n = new Intent(this, Activity24.class);
        startActivity(n);
    }
}
