package org.example.SysLogger

import org.example.Interface.LoggerGenerico
import java.io.FileWriter
import java.io.IOException

// Sistema de log via arquivo
class SistemaArquivo: LoggerGenerico {
    override fun print(message: String) {

        // Local onde vai ser salvo o arquivi
        val path = "/home/tchelo/logs.txt"
        try {
            // Escrever em um arquivo .txt uma mensagem
            val fileWriter = FileWriter(path, true)
            fileWriter.write("\n===================\n")
            fileWriter.write(message)
            fileWriter.close()
            println("Log salvo no local $path")
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }
}