package com.toong.androidrotateanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView mLight;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLight = (ImageView) findViewById(R.id.light);

        Animation a =
                AnimationUtils.loadAnimation(this, R.anim.rotate_light_fan);
        mLight.startAnimation(a);
    }
}
