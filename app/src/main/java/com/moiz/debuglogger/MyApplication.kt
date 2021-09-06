package com.moiz.debuglogger

import android.app.Application
import com.moiz.debuglog.Dlog

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        Dlog.init(BuildConfig.DEBUG)

    }

}