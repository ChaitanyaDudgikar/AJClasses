package com.aj.ajclasses;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ResultsActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Results");

        WebView containerWebview = findViewById(R.id.resultsWebView);
        containerWebview.setWebViewClient(new MyWebViewClient());
        String url = "https://drive.google.com/drive/folders/1SC47rA4mkTuWsdOj_FEzjVhk39ZJ4H0O?usp=sharing";
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
