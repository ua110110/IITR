package com.example.iitroorkee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class Activity1 extends AppCompatActivity {
    ViewFlipper v_flipper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        int images[] = {R.drawable.roorkee, R.drawable.roorkee2 , R.drawable.roorkee3,R.drawable.roorkee4,R.drawable.roorkee5,R.drawable.roorkee6,R.drawable.roorkee7,R.drawable.logo2} ;

        v_flipper = findViewById(R.id.v_flipper);

    //    for(int i=0;i < images.length;i++){
    //        flipperImages(images[i]);
   //     }

        for (int image: images){
            flipperImages(image);
        }
    }

    public void flipperImages(int image){
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);

        v_flipper.addView(imageView);
        v_flipper.setFlipInterval(2000);
        v_flipper.setAutoStart(true);
        v_flipper.setInAnimation(this, android.R.anim.slide_in_left);
        v_flipper.setOutAnimation(this, android.R.anim.slide_out_right);

    }
    public void canteen(View view){
        Intent i = new Intent(this,Activity2.class);
        startActivity(i);
    }
    public void bhawan(View view){
        Intent j = new Intent(this,Activity3.class);
        startActivity(j);
    }
    public void department(View view){
        Intent k = new Intent(this,Activity4.class);
        startActivity(k);
    }
    public void shops(View view){
        Intent l = new Intent(this,Activity5.class);
        startActivity(l);
    }
    public void facts(View view){
        Intent m = new Intent(this,Activity6.class);
        startActivity(m);
    }
    public void notices(View view){
        Intent m = new Intent( Intent.ACTION_VIEW, Uri.parse("https://www.iitr.ac.in/campus_life/pages/Facilities+Notices.html"));
        startActivity(m);
    }
}
