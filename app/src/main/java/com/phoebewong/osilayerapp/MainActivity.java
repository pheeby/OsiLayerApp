package com.phoebewong.osilayerapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton imageButton1;
    ImageButton imageButton2;
    ImageButton imageButton3;
    ImageButton imageButton4;
    ImageButton imageButton5;
    ImageButton imageButton6;
    ImageButton imageButton7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageButton1 = findViewById(R.id.imageButton1);
        imageButton1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, Layer1.class));
            }
        });

        imageButton2 = findViewById(R.id.imageButton2);
        imageButton2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, Layer2.class));

            }
        });

        imageButton3 = findViewById(R.id.imageButton3);
        imageButton3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, Layer3.class));

            }
        });

        imageButton4 = findViewById(R.id.imageButton4);
        imageButton4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, Layer4.class));

            }
        });

        imageButton5 = findViewById(R.id.imageButton5);
        imageButton5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, Layer5.class));

            }
        });

        imageButton6 = findViewById(R.id.imageButton6);
        imageButton6.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, Layer6.class));

            }
        });

        imageButton7 = findViewById(R.id.imageButton7);
        imageButton7.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, Layer7.class));

            }
        });

    }
}
