package org.pursuit.Group_portfolio_HW_TEAM_THE_TRIPLE_THREAT;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {
    private static int SCREEN_TIME = 3000;//Controls the amount of time the splash screen will be up for. (3000 == 3 seconds)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this, ChoosePerson.class);
                startActivity(intent);
                finish();
            }
        }, SCREEN_TIME);
    }
}
