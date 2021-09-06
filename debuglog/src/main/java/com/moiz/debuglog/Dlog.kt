package com.moiz.debuglog

import android.content.Context
import android.util.Log

class Dlog {
    companion object{

        private var isDebugBuild : Boolean = true

        fun init(appBuildType : Boolean){
            isDebugBuild = appBuildType
        }

        fun d(tag : String, message : String){
            if(isDebugBuild){
                Log.d(tag, message)
            }
        }
    }
}