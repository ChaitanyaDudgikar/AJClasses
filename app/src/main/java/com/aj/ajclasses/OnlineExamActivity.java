package com.aj.ajclasses;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class OnlineExamActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_online_exam);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Online Exam");

        WebView containerWebview = findViewById(R.id.examWebView);
        containerWebview.setWebViewClient(new MyWebViewClient());
        String url = "https://drive.google.com/drive/folders/1Gg8Cuct8OmM4XkP-t4FGLNfk2ua94vku?usp=sharing";
        containerWebview.getSettings().setJavaScriptEnabled(true);
        containerWebview.loadUrl(url);
    }
    private class MyWebViewClient extends WebViewClient
    {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}