package com.example.android.fitnessguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class WorkoutHighActivity extends AppCompatActivity {

    VideoView player;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_high);
        player = findViewById(R.id.videoplayer);
        String path ="android.resource://"+ getPackageName()+"/"+R.raw.video;
        player.setVideoPath(path);

        MediaController mediaController = new MediaController(this);
        player.setMediaController(mediaController);
        mediaController.setAnchorView(player);
        player.start();

    }
}