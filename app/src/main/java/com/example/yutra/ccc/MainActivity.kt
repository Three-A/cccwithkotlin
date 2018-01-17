package com.example.yutra.ccc

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

//https://codeshare.io/5odBdo
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSosmed.setOnClickListener{
            val intentSosmed = Intent(Intent.ACTION_SEND)
            intentSosmed.putExtra(Intent.EXTRA_TEXT,
                        content.text.toString())
                  intentSosmed.setType("text/plain")
                startActivity(intentSosmed)

        }

        btnToast.setOnClickListener{
//           Toast.makeText(this, "ini adalah Toast Pertama Saya",
//                    Toast.LENGTH_SHORT).show()
            val url = "http://www.youtube.com"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }
    }
}

