package com.example.daniel.codelandoop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Cuestionario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuestionario);
        String url="";
        url=getIntent().getStringExtra("url");
        WebView cuestionario = (WebView) findViewById(R.id.wvCuestionario);
        cuestionario.getSettings().setJavaScriptEnabled(true);
        cuestionario.setWebViewClient(new wbc());
        cuestionario.loadUrl(url);
    }
    private class  wbc extends WebViewClient{
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}
