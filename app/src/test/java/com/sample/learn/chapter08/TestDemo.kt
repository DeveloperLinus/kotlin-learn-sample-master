package com.sample.learn.chapter08

import org.junit.Test

class TestDemo {
    @Test
    fun test01() {
        val state = 3
        val d = when(state) {
            2 -> {
                println("state =2")
                4
            }
            else -> {
                println("state != 2")
                5
            }
        }
        println("d=$d")
    }

    @Test
    fun test02() {
        var a = (360 - 0) % 360
        println("a=$a")
        a = (360 - 90) % 360
        println("a=$a")
        a = (360 - 270) % 360
        println("a=$a")
        a = (360 - 360) % 360
        println("a=$a")
    }
}