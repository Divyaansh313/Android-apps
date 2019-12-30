package com.example.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fade(View view){

        ImageView kai = (ImageView) findViewById(R.id.kai);

        ImageView ray = (ImageView) findViewById(R.id.ray);

        kai.animate().alpha(0f).setDuration(2000);

        ray.animate().alpha(1f).setDuration(2000);

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

