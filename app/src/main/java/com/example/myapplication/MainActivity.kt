package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button

class MainActivity : AppCompatActivity() {

    var myWebView: WebView? = null
    var refreshButton: Button? = null
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val context: Context = getApplicationContext()
        myWebView = findViewById(R.id.webview) as WebView?
        refreshButton = findViewById(R.id.refresh) as Button?
        myWebView?.setWebViewClient(object : WebViewClient() {

        })
        myWebView?.loadUrl("https://scratch.mit.edu")
        val webSettings: WebSettings? = myWebView?.getSettings()
        webSettings?.setJavaScriptEnabled(true)
        refreshButton?.setOnClickListener {
            myWebView?.loadUrl("https://scratch.mit.edu")
        }
    }
}