package com.example.testingui1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        final Intent i = new Intent(this, LoginForm.class);  //After Showing Splash Screen Intent to next activity
        Thread timer = new Thread()
        {
            public void run () {
                try {
                    sleep(1800);  //timer (1000 = 1sec)
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    startActivity(i);
                    finish();
                }
            }


        };

        timer.start();
    }
}
