package com.example.lottieanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {
LottieAnimationView laView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // if you can star animation for using button we help for java logic
      /*  laView.setAnimation(R.raw.animation_lk2443bd);
        laView.playAnimation();
        laView.loop(true);

       */

    }
}