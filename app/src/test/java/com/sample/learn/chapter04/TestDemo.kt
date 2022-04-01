package com.sample.learn.chapter04

import org.junit.Test

class TestDemo {
    data class Point(val x: Int, val y: Int) {
        val isInBounds = x in 1..19 && y in 1..19
    }
    @Test
    fun test01() {
        val point01 = Point(5, 5)
        val point02 = Point(5, 5)
        println("result01=${point01}")
        println("result02=${point01.isInBounds}")
        println("result03=${point01 == point02}") // 比较数据 true
        println("result04=${point01.equals(point02)}")  // true比较数据 Any超类实现的是===,而数据类实现的是==
        println("result05=${point01 === point02}") // false
    }
}