package com.sample.learn.chapter03

import org.junit.Test

class TestDemo {
    @Test
    fun test03() {
        val map01 = mapOf(Pair("one", 1), Pair("two", 2))
        println("map01=$map01")
        val map02 = mapOf("one" to 10, "two" to 30)
        println("map02=$map02")
    }

    @Test
    fun test02() {
        val set = listOf("one", "two", "three", "four", "five").toSet()
        set.forEachIndexed { index, s ->
            println("index=$index, s=$s")
        }
        val list = set.toList()
        list.forEach { item->
            println("item=$item")
        }
        val intArray: IntArray = intArrayOf(1, 2, 3) // 数组类型
    }

    @Test
    fun test01 () { // run可以用来执行函数引用
        val result01 = "The people's Republic of china".run(::isLong)
        println("result01=$result01")
        "The people's Republic of china".run(::isLong)
            .run(::show)
            .run(::println)
    }

    private fun isLong(name:String) = name.length >= 10
    private fun show(isLong:Boolean): String {
        return if (isLong) {
            "is too many words"
        } else {
            "Please rename"
        }
    }
}