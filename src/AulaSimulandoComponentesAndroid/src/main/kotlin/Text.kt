package org.example

abstract class Text(val text: String, val pos: Pair<Int, Int>): Component() {
    override fun render() {
        super.render()
        println("Desenhando o texto $text")
    }
}