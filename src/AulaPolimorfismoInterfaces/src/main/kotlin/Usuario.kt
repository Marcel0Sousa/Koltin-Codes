package org.example

import org.example.Interface.LoggerGenerico

class Usuario(val loggerGenerico: LoggerGenerico) {

    // Construtor
    init {
        log("Usuário criado!")
    }

    fun criarPublicacao() {
        log("Novo poster criado!")
    }

    fun log(mensagem: String) {
        try {

            loggerGenerico.print(mensagem)

        } catch (e: Exception) {
            println(e)
        }
    }
}