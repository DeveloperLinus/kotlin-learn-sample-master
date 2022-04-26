package com.sample.learn.framework

interface CmdExecutor {
    fun isIotConnected(): Boolean
    fun execute(task: Task)
    fun sendRequest()
}