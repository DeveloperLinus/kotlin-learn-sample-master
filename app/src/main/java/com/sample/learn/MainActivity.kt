package com.sample.learn

import android.content.Intent
import com.sample.learn.banner.YouthBannerActivity
import com.sample.learn.databinding.ActMainBinding

class MainActivity : BaseBindingActivity<ActMainBinding>() {
    override fun getLayoutId() = R.layout.act_main

    override fun init() {

    }

    override fun initListener() {
        super.initListener()
        binding.btnAnnotation.setOnClickListener {
            startActivity(Intent(this, AnnotationActivity::class.java))
        }

        binding.btnYouthBanner.setOnClickListener {
            startActivity(Intent(this, YouthBannerActivity::class.java))
        }
    }
}