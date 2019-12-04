package com.example.testinguithemeandanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class Main2Activity extends AppCompatActivity {
    Animation rotate;
    TextView regText, LogText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
//declaration
        final ImageView down = findViewById(R.id.down);
        final ImageView up = findViewById(R.id.up);
        final ScrollView scroll = findViewById(R.id.scrollll);
        regText = findViewById(R.id.registerText);
        LogText = findViewById(R.id.loginText);

        rotate = AnimationUtils.loadAnimation(
                getApplicationContext(),
                R.anim.rotate);

        //this is to scroll down to register page
        down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                down.startAnimation(rotate);
                Toast.makeText(getApplicationContext(), "Register", Toast.LENGTH_SHORT).show();
                ObjectAnimator anim = ObjectAnimator.ofInt(scroll, "scrollY", scroll.getBottom());//scroll animation
                anim.setDuration(1000);//scroll animation time
                anim.start();


                down.setEnabled(false);
                Timer buttonTimer = new Timer();//this is for animation time after 1 second
                //the process will work
                buttonTimer.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                down.setEnabled(true);
                                down.setVisibility(View.INVISIBLE);
                                up.setVisibility(View.VISIBLE);
                                regText.setVisibility(View.INVISIBLE);
                                LogText.setVisibility(View.VISIBLE);
                            }
                        });
                    }
                }, 1000);
            }
        });
        //this is to scroll up to Login page
        up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                up.startAnimation(rotate);
                ObjectAnimator anim = ObjectAnimator.ofInt(scroll, "scrollY", up.getTop());

                anim.setDuration(1000);
                anim.start();
                Toast.makeText(getApplicationContext(), "Login", Toast.LENGTH_SHORT).show();
                up.setEnabled(false);
                Timer buttonTimer = new Timer();
                buttonTimer.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                up.setEnabled(true);
                                up.setVisibility(View.INVISIBLE);
                                down.setVisibility(View.VISIBLE);
                                LogText.setVisibility(View.INVISIBLE);
                                regText.setVisibility(View.VISIBLE);
                            }
                        });
                    }
                }, 1000);

            }
        });//thank you and find my bug if u see my bug tell me E-mail-saizayarhtet@ucstgi.edu.mm

    }
}
