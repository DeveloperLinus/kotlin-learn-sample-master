package com.sample.learn.base

import android.app.Activity
import android.os.Build
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.FragmentActivity

abstract class BaseActivity<T : ViewDataBinding> : FragmentActivity() {
    protected lateinit var mBinding: T
    protected lateinit var mActivity: Activity
    val FLAG_HOMEKEY_DISPATCHED = -0x80000000 //定义屏蔽参数


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // 做一些共有基本的初始化操作
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        window.setFlags(
            WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON,
            WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON
        )
        this.window.setFlags(
            FLAG_HOMEKEY_DISPATCHED,
            FLAG_HOMEKEY_DISPATCHED
        ) //应该放在设置布局方法前实现

        hideBottomMenuUI() //应该放在设置布局方法前实现
        mBinding = DataBindingUtil.setContentView(this, getLayoutId())
        mActivity = this

        init()
    }

    protected abstract fun init()

    protected abstract fun getLayoutId(): Int

    protected fun hideBottomMenuUI() {
        var uiFlags = (View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION // hide nav bar
                or View.SYSTEM_UI_FLAG_FULLSCREEN) // hide status bar


        uiFlags = if (Build.VERSION.SDK_INT >= 19) {
            uiFlags or 0x00001000 //SYSTEM_UI_FLAG_IMMERSIVE_STICKY: hide navigation bars - compatibility: building API level is lower thatn 19, use magic number directly for higher API target level
        } else {
            uiFlags or View.SYSTEM_UI_FLAG_LOW_PROFILE
        }
        window.decorView.systemUiVisibility = uiFlags
    }
}