package com.sample.learn.framework

class Cmd_2101 : BaseCmdExecutor() {
    override fun sendRequest() {
        if (isIotConnected()) {
            log("设备能力集上报")
        }
    }
}