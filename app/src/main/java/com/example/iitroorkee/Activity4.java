package com.example.iitroorkee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Activity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void cse(View view){
        Intent ram=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.iitr.ac.in/departments/CSE/pages/index.html"));
    startActivity(ram);}
    public void ec(View view){
        Intent sham=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.iitr.ac.in/departments/ECE/pages/Home.html"));
        startActivity(sham);}
    public void me(View view){
        Intent tam=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.iitr.ac.in/departments/ME/pages/index.html"));
        startActivity(tam);}
    public void civil(View view){
        Intent pam=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.iitr.ac.in/departments/CE/pages/index.html"));
        startActivity(pam);}
    public void meta(View view){
        Intent cham=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.iitr.ac.in/departments/MT/pages/index.html"));
        startActivity(cham);}
}
