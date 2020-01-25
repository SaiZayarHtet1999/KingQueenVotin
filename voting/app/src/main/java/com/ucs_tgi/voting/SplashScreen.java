package com.ucs_tgi.voting;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.airbnb.lottie.LottieAnimationView;


public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        LottieAnimationView lottieAnimationView=findViewById(R.id.splash_animation);
        Animation zoom = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom);
        Animation fade=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fadeout);
        ImageView cherry1=findViewById(R.id.cherry1);
        ImageView cherry2=findViewById(R.id.cherry2);
        ImageView cherry3=findViewById(R.id.cherry3);
        ImageView cherry4=findViewById(R.id.cherry4);
        ImageView cherry5=findViewById(R.id.cherry5);
        ImageView cherry6=findViewById(R.id.cherry6);
        ImageView cherry7=findViewById(R.id.cherry7);
        ImageView cherry8=findViewById(R.id.cherry8);
        ImageView cherry9=findViewById(R.id.cherry9);
        ImageView cherry10=findViewById(R.id.cherry10);
        ImageView cherry11=findViewById(R.id.cherry11);





        ObjectAnimator cherry101 = ObjectAnimator.ofFloat(cherry1 ,
                "rotation", 0f, 360f).setDuration(7000);
        ObjectAnimator cherry12=ObjectAnimator.ofFloat(cherry1,"translationY",0, 600).setDuration(9000);
        AnimatorSet cherry1set=new AnimatorSet();
        cherry1set.playTogether(cherry101,cherry12);
      cherry1set.start();


        ObjectAnimator cherry21 = ObjectAnimator.ofFloat(cherry2 ,
                "rotation", 0f, 360f).setDuration(7000);
        ObjectAnimator cherry22=ObjectAnimator.ofFloat(cherry2,"translationY",0, 300).setDuration(9000);
        AnimatorSet cherry2set=new AnimatorSet();
        cherry2set.playTogether(cherry21,cherry22);
        cherry2set.start();


        ObjectAnimator cherry31 = ObjectAnimator.ofFloat(cherry3 ,
                "rotation", 0f, 360f).setDuration(7000);
        ObjectAnimator cherry32=ObjectAnimator.ofFloat(cherry3,"translationY",0, 450).setDuration(9000);
        AnimatorSet cherry3set=new AnimatorSet();
        cherry3set.playTogether(cherry31,cherry32);
        cherry3set.start();
        ObjectAnimator cherry41 = ObjectAnimator.ofFloat(cherry4 ,
                "rotation", 0f, 360f).setDuration(7000);
        ObjectAnimator cherry42=ObjectAnimator.ofFloat(cherry4,"translationY",0, 300).setDuration(9000);
        AnimatorSet cherry4set=new AnimatorSet();
        cherry4set.playTogether(cherry41,cherry42);
        cherry4set.start();
        ObjectAnimator cherry51 = ObjectAnimator.ofFloat(cherry5 ,
                "rotation", 0f, 360f).setDuration(7000);
        ObjectAnimator cherry52=ObjectAnimator.ofFloat(cherry5,"translationY",0, 700).setDuration(9000);
        AnimatorSet cherry5set=new AnimatorSet();
        cherry5set.playTogether(cherry51,cherry52);
        cherry5set.start();
        ObjectAnimator cherry61 = ObjectAnimator.ofFloat(cherry6 ,
                "rotation", 0f, 360f).setDuration(7000);
        ObjectAnimator cherry62=ObjectAnimator.ofFloat(cherry6,"translationY",0, 550).setDuration(9000);
        AnimatorSet cherry6set=new AnimatorSet();
        cherry6set.playTogether(cherry61,cherry62);
        cherry6set.start();

        ObjectAnimator cherry71 = ObjectAnimator.ofFloat(cherry7 ,
                "rotation", 0f, 360f).setDuration(7000);
        ObjectAnimator cherry72=ObjectAnimator.ofFloat(cherry7,"translationY",0, 330).setDuration(9000);
        AnimatorSet cherry7set=new AnimatorSet();
        cherry7set.playTogether(cherry71,cherry72);
        cherry7set.start();
        ObjectAnimator cherry81 = ObjectAnimator.ofFloat(cherry8 ,
                "rotation", 0f, 360f).setDuration(7000);
        ObjectAnimator cherry82=ObjectAnimator.ofFloat(cherry8,"translationY",0, 420).setDuration(9000);
        AnimatorSet cherry8set=new AnimatorSet();
        cherry8set.playTogether(cherry81,cherry82);
        cherry8set.start();
        ObjectAnimator cherry91 = ObjectAnimator.ofFloat(cherry9 ,
                "rotation", 0f, 360f).setDuration(7000);
        ObjectAnimator cherry92=ObjectAnimator.ofFloat(cherry9,"translationY",0, 250).setDuration(9000);
        AnimatorSet cherry9set=new AnimatorSet();
        cherry9set.playTogether(cherry91,cherry92);
        cherry9set.start();
        ObjectAnimator cherry1011 = ObjectAnimator.ofFloat(cherry10 ,
                "rotation", 0f, 360f).setDuration(7000);
        ObjectAnimator cherry102=ObjectAnimator.ofFloat(cherry10,"translationY",0, 450).setDuration(9000);
        AnimatorSet cherry10set=new AnimatorSet();
        cherry10set.playTogether(cherry1011,cherry102);
        cherry10set.start();
        ObjectAnimator cherry111 = ObjectAnimator.ofFloat(cherry11 ,
                "rotation", 0f, 360f).setDuration(7000);
        ObjectAnimator cherry112=ObjectAnimator.ofFloat(cherry11,"translationY",0, 300).setDuration(9000);
        AnimatorSet cherry11set=new AnimatorSet();
        cherry11set.playTogether(cherry111,cherry112);
        cherry11set.start();

        getSupportActionBar().hide();
        Thread background = new Thread() {
            public void run() {
                try {
                    // Thread will sleep for 5 seconds
                    sleep(5*1000-500);
                   lottieAnimationView.startAnimation(zoom);
                   lottieAnimationView.startAnimation(fade);
                   sleep(6*100);

                    // After 5 seconds redirect to another intent
                    if (!isFirstTimeStatApp()){
                        Intent intent=new Intent(SplashScreen.this,MainActivity.class);
                        startActivity(intent);
                    }
                    else{
                        startMainActivity();
                    }

                    //Remove activity
                    finish();
                } catch (Exception e) {
                }
            }
        };

        // start thread
        background.start();



    }

    private boolean isFirstTimeStatApp(){
        SharedPreferences ref=getApplicationContext().getSharedPreferences("IntroSliderApp", Context.MODE_PRIVATE);
        return ref.getBoolean("FirstTimeStartFlag",true);
    }
    private void setFirstTimeStartStatus(boolean stt) {
        SharedPreferences ref = getApplicationContext().getSharedPreferences("IntroSliderApp", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = ref.edit();
        editor.putBoolean("FirstTimeStartFlag", stt);
        editor.apply();
    }

    private void startMainActivity() {
        setFirstTimeStartStatus(false);///this is important<<<<<<<<<change<to<<<<<<true<<<<<<<for<Testing<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

        startActivity(new Intent(SplashScreen.this,MainActivity.class));
        startActivity(new Intent(SplashScreen.this, slider.class));
        finish();
    }
}
