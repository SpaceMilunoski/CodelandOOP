package com.example.daniel.codelandoop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Cuestionario extends AppCompatActivity {
    String url="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        url=getIntent().getStringExtra("url");
        setContentView(R.layout.activity_cuestionario);
        WebView cuestionario = (WebView) findViewById(R.id.wvCuestionario);
        cuestionario.setWebViewClient(new WebViewClient());
        WebSettings settings = cuestionario.getSettings();
        settings.setJavaScriptEnabled(true);
        cuestionario.loadUrl(url);

    }
}
