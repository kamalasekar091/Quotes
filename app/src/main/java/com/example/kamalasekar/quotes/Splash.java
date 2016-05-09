package com.example.kamalasekar.quotes;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Kamara Sekar on 2/18/2016.
 */
public class Splash extends AppCompatActivity {

// splash screen delay time

    private static final int SPLASH_DISPLAY_TIME = 5000;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        new Handler().postDelayed(new Runnable() {
            public void run() {

                Intent intent = new Intent();
                intent.setClass(Splash.this, QuoteReaderActivity.class);


                Splash.this.startActivity(intent);
                Splash.this.finish();
            }
        }, SPLASH_DISPLAY_TIME);
    }

}

