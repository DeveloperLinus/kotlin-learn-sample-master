package com.sample.learn

import android.util.Log
import com.linus.commonlib.thread.ThreadPoolProxyFactory
import com.sample.learn.api.TestApi
import com.sample.learn.databinding.ActAnnotationBinding

class AnnotationActivity : BaseBindingActivity<ActAnnotationBinding>() {
    override fun getLayoutId() = R.layout.act_annotation

    override fun init() {
    }

    override fun initListener() {
        super.initListener()
        binding.btnWorkerThread.setOnClickListener {
           ThreadPoolProxyFactory.singleThreadPool?.submit(
                Runnable {
                    val result = TestApi.runOnWorkerThread("apple")
                    Log.d("debug", "result01=$result")
                }
            )
        }

        binding.btnUiThread.setOnClickListener {

        }
    }
}