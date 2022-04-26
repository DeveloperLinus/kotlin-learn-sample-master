package com.sample.learn.utils

import android.content.Context
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.sample.learn.R
import com.sample.learn.base.App
import com.youth.banner.loader.ImageLoader

class GlideImageLoader : ImageLoader() {
    override fun displayImage(context: Context?, path: Any?, imageView: ImageView?) {
        // 这里可以选择自己的图片加载器

        //具体方法内容自己去选择，次方法是为了减少banner过多的依赖第三方包，所以将这个权限开放给使用者去选择
        Glide.with(App.mContext)
            .load<Any>(path)
            .error(R.drawable.fengjing)
            .placeholder(R.drawable.fengjing)
            .into(imageView)
    }
}