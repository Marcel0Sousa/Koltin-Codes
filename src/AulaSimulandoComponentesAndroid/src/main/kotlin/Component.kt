package org.example

abstract class Component {
    abstract fun position(): Pair<Int, Int>

    open fun render() {
        println("Desenhando na tela")
    }
}