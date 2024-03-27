package com.example.emptyviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.android_lib_kawamura0.AdvancedWebView
import com.example.android_lib_kawamura0.AppInfoUtil
//import im.delight.android.webview.AdvancedWebView

class MainActivity : AppCompatActivity(), AdvancedWebView.Listener {
    private lateinit var mWebView: AdvancedWebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // アプリのバージョン名を取得
        val appVersionName = AppInfoUtil.getAppVersionName(this)
        println("App Version: $appVersionName")

        mWebView = findViewById(R.id.webview)
        mWebView.setListener(this, this)
        mWebView.loadUrl("https://www.google.com/")
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

    @Deprecated("Use onBackPressedDispatcher instead")
    override fun onBackPressed() {
        if (!mWebView.onBackPressed()) { return }
        super.onBackPressed()
    }

    // AdvancedWebView.Listenerの実装
    override fun onPageStarted(url: String?, favicon: android.graphics.Bitmap?) {
        // ページのロード開始時の処理
    }

    override fun onPageFinished(url: String?) {
        // ページのロード完了時の処理
    }

    override fun onPageError(errorCode: Int, description: String?, failingUrl: String?) {
        // ページロードエラー時の処理
    }

    override fun onDownloadRequested(url: String?, suggestedFilename: String?, mimeType: String?, contentLength: Long, contentDisposition: String?, userAgent: String?) {
        // ダウンロードリクエスト時の処理
    }

    override fun onExternalPageRequest(url: String?) {
        // 外部ページへのリクエスト時の処理
    }
}

