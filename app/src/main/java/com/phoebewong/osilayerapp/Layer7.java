package com.phoebewong.osilayerapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Button;

public class Layer7 extends AppCompatActivity {

    ImageView appFrontView;
    ImageView appBackView;
    Button quizButton;
    FrameLayout root;

    ScaleAnimation sato0 = new ScaleAnimation(1, 0, 1, 1,
            Animation.RELATIVE_TO_PARENT, 0.5f, Animation.RELATIVE_TO_PARENT, 0.5f);
    ScaleAnimation sato1 = new ScaleAnimation(0, 1, 1, 1,
            Animation.RELATIVE_TO_PARENT, 0.5f, Animation.RELATIVE_TO_PARENT, 0.5f);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layer7);

          //  quizButton = (Button) findViewById(R.id.quizButton);
            quizButton.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startActivity(new Intent(Layer7.this, Quiz.class));
                }
            });

        initView();
        appFrontView.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (appBackView.getVisibility() == View.VISIBLE) {
                        appBackView.startAnimation(sato0);
                    } else {
                        appFrontView.startAnimation(sato0);
                    }
                }
            });

            appBackView.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (appFrontView.getVisibility() == View.VISIBLE) {
                        appFrontView.startAnimation(sato0);
                    } else {
                        appBackView.startAnimation(sato0);
                    }
                }
            });
        }

        private void showAppFrontView(){
            appFrontView.setVisibility(View.VISIBLE);
            appBackView.setVisibility(View.INVISIBLE);
        }

        private void showAppBackView(){
            appFrontView.setVisibility(View.INVISIBLE);
            appBackView.setVisibility(View.VISIBLE);
        }

        private void initView(){
            appFrontView = (ImageView) findViewById(R.id.appFrontView);
            appBackView = (ImageView) findViewById(R.id.appBackView);
            showAppFrontView();
            sato0.setDuration(300);
            sato1.setDuration(300);

            sato0.setAnimationListener(new AnimationListener() {
                @Override
                public void onAnimationStart(Animation animation) {

                }

                @Override
                public void onAnimationEnd(Animation animation) {
                    if (appFrontView.getVisibility() == View.VISIBLE) {
                        appFrontView.setAnimation(null);
                        showAppBackView();
                        appBackView.startAnimation(sato1);
                    } else {
                        appBackView.setAnimation(null);
                        showAppFrontView();
                        appFrontView.startAnimation(sato1);
                    }
                }

                @Override
                public void onAnimationRepeat(Animation animation) {
                }
            });


        }
    }

