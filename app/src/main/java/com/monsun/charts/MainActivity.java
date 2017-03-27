package com.monsun.charts;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import static com.monsun.charts.R.id.webView;

public class MainActivity extends AppCompatActivity {

    private WebView webview ;
    @Override

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //webview use to call own site
        WebView webview = (WebView) this.findViewById(R.id.webView);

        webview.setWebViewClient(new WebViewClient());
        webview.getSettings().setJavaScriptEnabled(true);
        webview.getSettings().setDomStorageEnabled(true);
        webview.loadUrl("http://webapps.qlik.com/ajc/jobchange/index.html");


//        //Remove title bar
//        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

//        //Remove notification bar


//        this.setContentView(R.layout.activity_main);
//
//        WebView myWebView = (WebView) this.findViewById(R.id.webview);
//
//        WebSettings webSettings = myWebView.getSettings();
//        webSettings.setJavaScriptEnabled(true);
//        webSettings.setAllowContentAccess(true);
//        webSettings.setAllowFileAccess(true);
//        webSettings.setAppCacheEnabled(true);
//        webSettings.setBuiltInZoomControls(true);
//        webSettings.setBuiltInZoomControls(true);
//        webSettings.setDatabaseEnabled(true);
//        webSettings.setJavaScriptCanOpenWindowsAutomatically(true);
//        webSettings.setLoadsImagesAutomatically(true);
//        webSettings.setSupportZoom(true);
//        webSettings.getAllowContentAccess();
//
//
//
//        myWebView.loadUrl("http://webapps.qlik.com/ajc/jobchange/index.html");
//        //myWebView.loadUrl("http://webapps.qlik.com/euronews/life/index.html#/");
//
//        myWebView.setWebViewClient(new WebViewClient());
//

    }



}
