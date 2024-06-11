package org.example.Componnts

import org.example.Text

class Link(text: String, pos: Pair<Int, Int>): Text(text, pos) {
    override fun position(): Pair<Int, Int> {
        return pos
    }

}