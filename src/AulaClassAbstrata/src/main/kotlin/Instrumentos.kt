package org.example

abstract class Instrumento(val nome: String) {
    abstract fun afinar(): Boolean

    fun tocar(musico: Musico) {
        if (afinar()) {
            println("Tocar a musica usando o instrumento $nome")
        } else {
            println("${musico.nome}, por favor, afine o seu instrumento antes de tocar")
        }
    }
}

class Musico(var nome: String)

abstract class instrumentoCordas(nome: String, var numeroCordas: Int): Instrumento(nome)
abstract class instrumentoSopro(nome: String, var numeroFuros: Int): Instrumento(nome)

class Guitarra(nome: String) : instrumentoCordas(nome, 6) {
    override fun afinar(): Boolean {
        println("${nome}, afinação em E(Mi)")
        return true
    }
}

class Flauta(nome: String) : instrumentoSopro(nome, 6) {
    override fun afinar(): Boolean {
        println("${nome}, afinação em C(Dó)")
        return true
    }
}

class Violino(nome: String) : instrumentoCordas(nome, 4) {
    override fun afinar(): Boolean {
        println("${nome}, afinação em A(Lá)")
        return false
    }

}