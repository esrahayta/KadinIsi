package com.haytaesra.kadinisi.Activity;

import android.app.Activity;
import android.os.Bundle;

import com.haytaesra.kadinisi.R;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by esra on 5.9.2017.
 */

public class SplashScreenActivity extends Activity {

    private static final ScheduledExecutorService worker = Executors.newSingleThreadScheduledExecutor();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Runnable task = new Runnable() {
            public void run() {
                OnBoardActivity.show(null,SplashScreenActivity.this);
                finish();
            }
        };
        worker.schedule(task, 2, TimeUnit.SECONDS);

    }
}
