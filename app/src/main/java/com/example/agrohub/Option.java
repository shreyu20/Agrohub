package com.example.agrohub;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Option extends AppCompatActivity {

    private Button btn1;
    private Button btn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option);
        btn1=(Button)findViewById(R.id.button);
        btn4=(Button)findViewById(R.id.button4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUser14();
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUser13();
            }

        });
    }
    public void openUser13()
    {
        Intent intent=new Intent(this,LoginActivity.class);
        startActivity(intent);
    }
    public void openUser14()
    {
        Intent intent=new Intent(this,Home.class);
        startActivity(intent);
    }
}
