package com.example.demoapp;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.ShareActionProvider;

public class MainActivity extends AppCompatActivity {
    ImageView image;
    private ShareActionProvider shareActionProvider;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Start","Started App");
        image =  (ImageView) findViewById(R.id.imageView);
        image.setImageResource(R.drawable.hbcard);
    }
}
