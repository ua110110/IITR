package com.example.iitroorkee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Activity13 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_13);

    }
    public void conrajendra(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.iitr.ac.in/campus_life/Hostels/RJB/"));
        startActivity(i);
    }
}
