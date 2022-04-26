package com.sample.learn.base

import android.app.Application
import android.content.Context

class App : Application() {
    companion object {
        @JvmField
        var mContext: Context? = null
    }

    override fun onCreate() {
        super.onCreate()
        mContext = this
    }
}