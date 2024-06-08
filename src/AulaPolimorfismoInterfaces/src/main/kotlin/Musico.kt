package org.example

import org.example.Interfaces.Tocavel

class Musico(nome: String) {

    lateinit var tocavel: Tocavel
    fun starPlay() {
        tocavel.play()
    }
}