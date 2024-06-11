package org.example

import org.example.Componnts.Link
import org.example.View.TelaPrincipal


fun main() {
    val linkEntrar = Link("Entrar", 10 to 20)
    val tela = TelaPrincipal()
    println("Antes do click no link")
    linkEntrar.clickListener = tela
    linkEntrar.click()
    println("Depois do click no link")
}

