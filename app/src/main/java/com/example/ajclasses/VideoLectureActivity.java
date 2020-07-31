package com.example.ajclasses;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class VideoLectureActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_lecture);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Video Lectures");

    }
}
