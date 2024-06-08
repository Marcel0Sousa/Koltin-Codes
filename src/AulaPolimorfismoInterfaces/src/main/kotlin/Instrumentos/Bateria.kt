package org.example.Instrumentos

import org.example.Interfaces.Tocavel

class Bateria: Tocavel {
    override fun play() {
        println("Tocando Bateria")
    }
}