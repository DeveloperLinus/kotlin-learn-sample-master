package com.sample.learn.banner

import android.os.Bundle
import com.sample.learn.R
import com.sample.learn.base.BaseActivity
import com.sample.learn.databinding.ActYouthBannerLayoutBinding
import com.sample.learn.utils.GlideImageLoader
import com.youth.banner.BannerConfig

class YouthBannerActivity : BaseActivity<ActYouthBannerLayoutBinding>() {
    override fun init() {
        initBanner()
    }

    override fun getLayoutId(): Int {
        return R.layout.act_youth_banner_layout
    }

    private fun initBanner() {
        val list = ArrayList<Int>()
        list.add(R.drawable.fengjing)
        list.add(R.drawable.b)
        list.add(R.drawable.c)
        list.add(R.drawable.d)
        mBinding.faceAdvBanner.setImages(list)
            .setImageLoader(GlideImageLoader())
            .setBannerStyle(BannerConfig.NOT_INDICATOR)
            .setDelayTime(1000 * 8)
            .start()
    }
}