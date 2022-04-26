package com.sample.learn.framework

object CmdHelper {
    private val CMD_EXECUTOR_MAP: HashMap<String, CmdExecutor> = HashMap()

    init {
        CMD_EXECUTOR_MAP[CmdConfig.CMD_2101] = Cmd_2101()
        CMD_EXECUTOR_MAP[CmdConfig.CMD_3320] = Cmd_3200()
    }

    @JvmStatic
    fun getExecutor(cmd: String) : CmdExecutor {
        return (CMD_EXECUTOR_MAP[cmd] ?: Cmd_None())
    }
}