package com.example.ajclasses;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Notification;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    CardView examCardView,lectureCardView,notificationCardView,notesCardView;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        examCardView=findViewById(R.id.onlineExamCardView);
        lectureCardView=findViewById(R.id.videoLectureCardView);
        notificationCardView=findViewById(R.id.notificationCardView);
        notesCardView=findViewById(R.id.notesCardView);

        examCardView.setOnClickListener(this);
        lectureCardView.setOnClickListener(this);
        notificationCardView.setOnClickListener(this);
        notesCardView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
        Intent i;
        switch (view.getId()){
        case R.id.onlineExamCardView : i=new Intent(getApplicationContext(),OnlineExamActivity.class);
            startActivity(i);
        break;
        case R.id.videoLectureCardView : i=new Intent(getApplicationContext(),VideoLectureActivity.class);
            startActivity(i);
        break;
        case R.id.notificationCardView : i=new Intent(getApplicationContext(), NotificationActivity.class);
            startActivity(i);
        break;
        case R.id.notesCardView : i=new Intent(getApplicationContext(),NotesActivity.class);
            startActivity(i);
        break;
        default:break;
        }

    }
}
