package com.moizhassan.debuglogger

import android.app.Application
import com.moizhassan.debuglog.Dlog

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        Dlog.init(BuildConfig.DEBUG)

    }

}