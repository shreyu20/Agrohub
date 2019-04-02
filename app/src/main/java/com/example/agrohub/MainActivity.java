package com.example.agrohub;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    private ImageView Logo;
    Timer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Logo=(ImageView)findViewById(R.id.imageView);
        timer=new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
              Intent intent=new Intent(MainActivity.this,Option.class);
                startActivity(intent);
                finish();
            }
        },1500);
        //Intent intent = new Intent(this, Option.class);
        //startActivity(intent);
    }
}
