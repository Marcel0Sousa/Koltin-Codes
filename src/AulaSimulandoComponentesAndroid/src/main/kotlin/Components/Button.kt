package org.example.Componnts

import org.example.Text

class Button(text: String, val backgroundColor: Int, pos: Pair<Int, Int>): Text(text, pos) {
    override fun position(): Pair<Int, Int> {
        return pos
    }

    override fun render() {
        super.render()
        println("Desenhando a cor $backgroundColor")
    }
}