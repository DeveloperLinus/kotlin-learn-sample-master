package com.sample.learn.chapter07

import org.junit.Test

class TestDemo {
    fun String.println(default: String) = print(this ?: "String is null")

    fun String?.println02(default: String) = println(this?: " String is null")

    infix fun String?.println03(default: String) = println(this?: " String is null")

    @Test
    fun test01() {
        val name:String? =null
        name?.println("xiao min") // 没有值打印

        name.println02("xiao min") // 打印String is null

        name println03  "xiaomin" // 打印String is null
    }
}