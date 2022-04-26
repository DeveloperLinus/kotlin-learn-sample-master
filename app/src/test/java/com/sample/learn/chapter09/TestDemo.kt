package com.sample.learn.chapter09

import com.sample.learn.framework.CmdConfig
import com.sample.learn.framework.CmdHelper
import com.sample.learn.framework.Task
import org.junit.Test

class TestDemo {
    @Test
    fun test() {
        val task = Task("3320", "查询设备能力集")
        CmdHelper.getExecutor(CmdConfig.CMD_3320).execute(task)
    }

    @Test
    fun test2() {
       val value =  "0023".toInt()
        println("value=$value")
    }
}