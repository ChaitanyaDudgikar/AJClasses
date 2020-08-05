package com.aj.ajclasses;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class NotesActivity extends AppCompatActivity
{

    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Notes");

        WebView containerWebview = findViewById(R.id.notesWebView);
        containerWebview.setWebViewClient(new MyWebViewClient());
        String url = "https://drive.google.com/drive/folders/1gSasJ1j8hU7b2T8llwx2pZA7H_WIONpt?usp=sharing";
        containerWebview.getSettings().setJavaScriptEnabled(true);
        containerWebview.loadUrl(url);
    }
    private class MyWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}

