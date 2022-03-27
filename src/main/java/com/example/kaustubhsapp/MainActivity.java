package com.example.kaustubhsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    VideoView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view = findViewById(R.id.videoView);
        String path = "android.resource://" + getPackageName() + "/" + R.raw.rnr;
        Uri uri = Uri.parse(path);
        view.setVideoURI(uri);
        view.requestFocus();
        view.start();
    }
}