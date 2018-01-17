package com.example.yutra.ccc

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val handler = Handler()
        handler.postDelayed(Runnable {
            startActivity(Intent(this@SplashActivity
                    , MainActivity::class.java))
            finish()
        }, 5000L)
    }
}
