package com.moizhassan.debuglog

import android.util.Log

class Dlog {
    companion object{

        private var isDebugBuild : Boolean = true

        @JvmStatic fun init(appBuildType : Boolean){
            isDebugBuild = appBuildType
        }

        @JvmStatic fun d(tag : String, message : String){
            if(isDebugBuild){
                Log.d(tag, message)
            }
        }

        @JvmStatic fun d(tag : String, message : String, throwable: Throwable){
            if(isDebugBuild){
                Log.d(tag, message, throwable)
            }
        }

        @JvmStatic fun e(tag : String, message : String){
            if(isDebugBuild){
                Log.e(tag, message)
            }
        }

        @JvmStatic fun e(tag : String, message : String, throwable: Throwable){
            if(isDebugBuild){
                Log.e(tag, message, throwable)
            }
        }

        @JvmStatic fun v(tag : String, message : String){
            if(isDebugBuild){
                Log.v(tag, message)
            }
        }

        @JvmStatic fun v(tag : String, message : String, throwable: Throwable){
            if(isDebugBuild){
                Log.v(tag, message, throwable)
            }
        }

        @JvmStatic fun i(tag : String, message : String){
            if(isDebugBuild){
                Log.i(tag, message)
            }
        }

        @JvmStatic fun i(tag : String, message : String, throwable: Throwable){
            if(isDebugBuild){
                Log.i(tag, message, throwable)
            }
        }

        @JvmStatic fun w(tag : String, message : String){
            if(isDebugBuild){
                Log.w(tag, message)
            }
        }

        @JvmStatic fun w(tag : String, message : String, throwable: Throwable){
            if(isDebugBuild){
                Log.w(tag, message, throwable)
            }
        }

        @JvmStatic fun wtf(tag : String, message : String){
            if(isDebugBuild){
                Log.wtf(tag, message)
            }
        }

        @JvmStatic fun wtf(tag : String, message : String, throwable: Throwable){
            if(isDebugBuild){
                Log.wtf(tag, message, throwable)
            }
        }

    }
}