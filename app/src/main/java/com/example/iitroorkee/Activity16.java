package com.example.iitroorkee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Activity16 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_16);
    }
    public void consar(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.iitr.ac.in/campus_life/web/SarojiniBhawan/"));
        startActivity(i);
    }
}
