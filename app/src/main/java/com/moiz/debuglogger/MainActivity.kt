package com.moiz.debuglogger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.moiz.debuglog.Dlog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnDebugLog.setOnClickListener {
            Dlog.d("MyTag", "My Dlogger Event")
        }

    }
}