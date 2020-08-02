package com.example.ajclasses;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    CardView examCardView,lectureCardView,notificationCardView,notesCardView,imageCardView;
    ImageView teacherImageView,studentImageView;
    Button button;
    boolean studentIsShowing=true;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        examCardView=findViewById(R.id.onlineExamCardView);
        lectureCardView=findViewById(R.id.videoLectureCardView);
        notificationCardView=findViewById(R.id.notificationCardView);
        notesCardView=findViewById(R.id.notesCardView);
        imageCardView=findViewById(R.id.imageCardView);

        teacherImageView=findViewById(R.id.teacherImageView);
        studentImageView=findViewById(R.id.studentImageView);

        button=findViewById(R.id.aboutus);
        button.setOnClickListener(this);

        examCardView.setOnClickListener(this);
        lectureCardView.setOnClickListener(this);
        notificationCardView.setOnClickListener(this);
        notesCardView.setOnClickListener(this);
        imageCardView.setOnClickListener(this);


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
            case R.id.notificationCardView : i=new Intent(getApplicationContext(), ResultsActivity.class);
            startActivity(i);
                break;
            case R.id.notesCardView : i=new Intent(getApplicationContext(),NotesActivity.class);
            startActivity(i);
                break;
            case R.id.imageCardView :
                if(studentIsShowing)
                    {
                        studentIsShowing=false;
                        teacherImageView.animate().alpha(0).setDuration(2000);
                        studentImageView.animate().alpha(1).setDuration(2000);
                    }else
                        {
                            studentIsShowing=true;
                            teacherImageView.animate().alpha(1).setDuration(2000);
                            studentImageView.animate().alpha(0).setDuration(2000);
                        }
                break;
            case R.id.aboutus : i=new Intent(getApplicationContext(), AboutUsActivity.class);
            startActivity(i);
                break;
            default:
                break;
        }

    }

}
