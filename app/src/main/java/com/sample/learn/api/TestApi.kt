package com.sample.learn.api

import android.content.Context
import android.widget.Toast
import androidx.annotation.MainThread
import androidx.annotation.UiThread
import androidx.annotation.WorkerThread

object TestApi {
    @JvmStatic
    @WorkerThread
    fun runOnWorkerThread(var0: String): String {
        Thread.sleep(5000)
        return "request01->$var0"
    }

    @JvmStatic
    @UiThread
    fun runOnMainThread(context: Context, var0: String) {
        Toast.makeText(context, var0, Toast.LENGTH_LONG).show()
    }
}