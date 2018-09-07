package com.app.chendhurfinecorpclient.Activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.app.chendhurfinecorpclient.Others.CF_Application;
import com.app.chendhurfinecorpclient.R;

public class Splash extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 3000;
    public static SharedPreferences pref;
    public static SharedPreferences.Editor editor;
    ImageView screen;
    Animation zoomin, zoomout, logoMoveAnimation, tran, fadein, fadeout,rotate, fadeinout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);  pref = getApplicationContext().getSharedPreferences("MCC",MODE_PRIVATE);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Window w = getWindow(); // in Activity's onCreate() for instance
            w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }
        screen = (ImageView) findViewById(R.id.logo);
        editor = pref.edit();
        if (CF_Application.isNetworkAvailable(Splash.this)) {
            animate();
            new Handler().postDelayed(new Runnable() {

                @Override
                public void run() {
                    Intent i = new Intent(Splash.this, Login.class);
                    startActivity(i);
                    finish();
                    overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
                }
            }, SPLASH_TIME_OUT);
        }
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        CF_Application.freeMemory();
    }
    public void animate()
    {
        zoomin = AnimationUtils.loadAnimation(this, R.anim.zoom_in);
        zoomout = AnimationUtils.loadAnimation(this, R.anim.zoom_out);
        tran = AnimationUtils.loadAnimation(this, R.anim.translate);
        logoMoveAnimation = AnimationUtils.loadAnimation(this, R.anim.scale_and_translate);
        fadein = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        fadeout = AnimationUtils.loadAnimation(this, R.anim.fade_out);
        fadeinout=AnimationUtils.loadAnimation(this,R.anim.fadeinandout);
        rotate = AnimationUtils.loadAnimation(this, R.anim.rotate_forward);
        AnimationSet s = new AnimationSet(false);
        s.addAnimation(tran);
        s.addAnimation(zoomin);
        // s.addAnimation(rotate);
        screen.startAnimation(s);
    }

}

