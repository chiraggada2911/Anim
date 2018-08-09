package com.tigergroup.anim;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView text = findViewById(R.id.chirag);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move_up);
        text.startAnimation(animation);

        TextView text1 = findViewById(R.id.happy);
        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move_down);
        text1.startAnimation(animation1);

        TextView text2 = findViewById(R.id.birthday);
        Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
        text2.startAnimation(animation2);

        handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
                finish();
            }
        }, 15000);

    }

}
