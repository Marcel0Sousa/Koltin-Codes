package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val jose = Musico("José Carlos")
    val aline = Musico("Aline Silva")
    val carlos = Musico("Carlos Aguiar")

    val guitarra = Guitarra("Guitar x")
    val flauta = Flauta("Flaura X")
    val violino = Violino("Violino N")

    tocar(guitarra, jose)
    tocar(flauta, aline)
    tocar(violino, carlos)

}

fun tocar(instrumento: Instrumento, musico: Musico) {
    instrumento.tocar(musico)
}