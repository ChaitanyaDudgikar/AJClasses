package com.example.ajclasses;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class OnlineExamActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_online_exam);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Online Exam");
    }
}