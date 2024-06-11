package org.example.Componnts

import org.example.OnClickListener
import org.example.Text

class Link(text: String, pos: Pair<Int, Int>): Text(text, pos) {

    lateinit var clickListener: OnClickListener

    override fun position(): Pair<Int, Int> {
        return pos
    }

    fun click() {
        clickListener.onClick()
    }

}