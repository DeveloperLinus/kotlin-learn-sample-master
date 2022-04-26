package com.sample.learn.framework

class Cmd_None : BaseCmdExecutor() {
    override fun execute(task: Task) {
        log("执行空内容")
    }
}