package com.sample.learn.chapter02

import org.junit.Test

class TestDemo {
    @Test
    fun test07() {
        val str = "%.2f".format(9.87667) // 会四舍五入
        println("str1=$str")
    }

    @Test
    fun test06() {
        val str1 = "man"
        val str2 = "man".capitalize()
        println("str1=$str1, str2=$str2")
        println(str1 == str2) // 值比较
        println(str1 === str2) // 引用比较
    }

    @Test
    fun test05() {
        val strl = "The people's Republic of China"
        val str2 = strl.substring(0 until 10)
        println("str2=$str2")
    }

    @Test
    fun test04() {
        val strl = "The people's Republic of China"
        val str2 = strl.replace(Regex("[aeiou]")) {
            when(it.value) {
                "a" -> "A"
                "e" -> "E"
                "i" -> "I"
                "o" -> "O"
                "u" -> "U"
                else -> it.value
            }
        }
        println("st1=$strl")
        println("str2=$str2")
    }

    @Test
    fun test03() {
        val name =  "xiaomi, xiaoli, xiaomin"
        val (s1: String, s2:String, s3:String) = name.split(",") // 解构语法特性
        println("s1=$s1, s2=$s2, s3=$s3")
    }

    @Test
    fun test02 () { // 先决条件函数
//        val value = null
//        checkNotNull(value = value)

        val s1 = "ni hao"
        val s2 = "ni hao"
        require(s1 == s2)
    }

    @Test
    fun test01() {
        try {
            checkOperation(null)
        } catch (e: Exception) {
            println("test01 catch exception, msg:${e.message}")
        }
    }
    private fun checkOperation(arg0 : String?) {
        arg0 ?: throw UnSkilledException()
    }

    // 自定义异常
    class UnSkilledException : NumberFormatException("格式不正确")
}