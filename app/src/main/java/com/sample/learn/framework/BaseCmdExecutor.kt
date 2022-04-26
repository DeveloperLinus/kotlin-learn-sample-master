package com.sample.learn.framework

abstract class BaseCmdExecutor : CmdExecutor{
    override fun execute(task: Task) {
        // 方法留给子类实现
    }

    override fun sendRequest() {
        // 方法留给子类实现
    }

    override fun isIotConnected(): Boolean {
        return true // 其他继承自BaseCmdExecutor的类，且该方法执行内容一致的，在这里实现
    }
}