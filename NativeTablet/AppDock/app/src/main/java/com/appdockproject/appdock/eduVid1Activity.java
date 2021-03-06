package com.appdockproject.appdock;

import android.content.Intent;
import android.graphics.PixelFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

/**
 * Created by CS on 7/31/16.
 */
public class eduVid1Activity extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eduvid1);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            int UI_OPTIONS = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_FULLSCREEN | View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION;
            getWindow().getDecorView().setSystemUiVisibility(UI_OPTIONS);
        }

        Button devBtn = (Button) findViewById(R.id.devBtn);
        Button homeBtn = (Button) findViewById(R.id.appBtn);
        Button cmntBtn = (Button) findViewById(R.id.comBtn);
        Button fbBtn = (Button) findViewById(R.id.fbBtn);

        devBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent intent = new Intent(eduVid1Activity.this, devActivity.class);
                startActivity(intent);
            }
        });


        homeBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent intent = new Intent(eduVid1Activity.this, appPage.class);
                startActivity(intent);
            }
        });

        cmntBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent intent = new Intent(eduVid1Activity.this, feedbackActivity.class);
                startActivity(intent);
            }
        });

        fbBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent intent = new Intent(eduVid1Activity.this, facebookActivity.class);
                startActivity(intent);
            }
        });

        String videoLink = "android.resource://com.appdockproject.appdock/"+R.raw.eduvideo1;
        final VideoView videoView = (VideoView) findViewById(R.id.videoView);

        videoView.setVideoPath(videoLink);

        videoView.start();

        }
    }

