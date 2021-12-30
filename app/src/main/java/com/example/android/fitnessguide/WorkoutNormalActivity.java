package com.example.android.fitnessguide;

import android.graphics.PixelFormat;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;


public class WorkoutNormalActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normalworkout);
        VideoView player = (VideoView) findViewById(R.id.videoplayer);
        String path ="android.resource://"+ getPackageName()+"/"+R.raw.worknormal;
        player.setVideoPath(path);

        MediaController mediaController = new MediaController(this);
        player.setMediaController(mediaController);
        mediaController.setAnchorView(player);
        player.start();

    }
}