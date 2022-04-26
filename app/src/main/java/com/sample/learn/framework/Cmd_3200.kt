package com.sample.learn.framework

// 3200 是服务器下发给设备的，设备需要用2101的回复
class Cmd_3200 : BaseCmdExecutor() {
    override fun execute(task: Task) {
       if (isIotConnected()) {
           log("服务器请求获取设备能力集")
           CmdHelper.getExecutor(CmdConfig.CMD_2101).sendRequest()
       }
    }
}