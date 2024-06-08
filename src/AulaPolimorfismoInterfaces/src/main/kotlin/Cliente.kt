package org.example

import org.example.Interfaces.Menu

class Cliente(nome: String) {

    lateinit var menu: Menu // Dependencia que o cliente precisa fazer o pedido (o Menu)
    fun fazerPedido() {
        val combo = menu.comboDoDia()
        println(combo)
    }

}