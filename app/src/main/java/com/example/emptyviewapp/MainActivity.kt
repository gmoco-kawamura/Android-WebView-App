package com.example.emptyviewapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import tech.gmo.smaad_webview_android.SmaAdWebView


class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //中央にボタン配置
        val openWebViewButton: Button = findViewById(R.id.openWebViewButton)
        openWebViewButton.setOnClickListener {
            // SmaAdWebViewActivityを開始
            val intent = Intent(this, SmaAdWebViewActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}

