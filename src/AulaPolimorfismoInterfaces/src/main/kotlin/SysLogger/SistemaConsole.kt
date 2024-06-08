package org.example.SysLogger

import org.example.Interface.LoggerGenerico

// Sistema de log via console
class SistemaConsole: LoggerGenerico {
    override fun print(message: String) {
        println(message)
    }
}