package com.android.rafael.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class PhotoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo);
        ImageView photo = (ImageView) findViewById(R.id.photo);
        photo.setImageResource(getIntent().getIntExtra("image",0));

    }
}
