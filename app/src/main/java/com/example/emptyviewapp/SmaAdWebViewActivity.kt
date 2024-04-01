package com.example.emptyviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.webkit.PermissionRequest
import android.webkit.WebView
import tech.gmo.smaad_webview_android.SmaAdWebView

class SmaAdWebViewActivity : AppCompatActivity(), SmaAdWebView.Listener {
    private lateinit var mWebView: SmaAdWebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.smaad_webview)

        mWebView = findViewById(R.id.webview)
        mWebView.Initialize(this, this, "560363030", "test1234")
        mWebView.ShowWebView()
    }

    override fun onResume() {
        super.onResume()
        mWebView.onResume()
    }

    override fun onPause() {
        mWebView.onPause()
        super.onPause()
    }

    override fun onDestroy() {
        mWebView.onDestroy()
        super.onDestroy()
    }

    // AdvancedWebView.Listenerの実装
    override fun onLoadStart(url: String?) {
        Log.e("TAG", "onLoadStart url = $url")
    }

    override fun onPermissionRequest(request: PermissionRequest?) {
        Log.e("TAG", "onPermissionRequest")
    }

    override fun shouldOverrideUrlLoading(url: String?) {
        Log.e("TAG", "onLoadStart url = $url")
    }

    override fun onLoadStop(url: String?) {
        Log.e("TAG", "onLoadStop url = $url")
    }

    override fun onReceivedError(errorCode: Int, description: String?, failingUrl: String?) {
        Log.e("TAG", "onReceivedError errorCode = $errorCode description = $description failingUrl = $failingUrl")
    }

    override fun onWebViewClosed() {
        Log.e("TAG", "onWebViewClosed")
        finish()
    }

    override fun onUpdateVisitedHistory(view: WebView?, url: String?, isReload: Boolean) {

    }

    override fun onConsoleMessage(message: String?, lineNumber: Int, sourceID: String?) {

    }
}

