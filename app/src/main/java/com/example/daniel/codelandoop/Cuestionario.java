package com.example.daniel.codelandoop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Cuestionario extends AppCompatActivity {
    String url="https://docs.google.com/forms/d/e/1FAIpQLSe9qgbeF2jK8t0UHWYgtLuSvRogGV9FBD7DPLnYBBf3lXBn7w/viewform?usp=sf_link";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuestionario);
        WebView cuestionario = (WebView) findViewById(R.id.wvCuestionario);
        cuestionario.setWebViewClient(new myclienteweb());
        WebSettings settings =  cuestionario.getSettings();
        cuestionario.loadUrl(url);

    }
    private  class  myclienteweb extends WebViewClient{
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}
