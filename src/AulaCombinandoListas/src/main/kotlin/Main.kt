package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val listaA = mutableListOf("Marcelo", "Carlos")
    val listaB = listOf("João", "José", "Maria", "Jessica", "Antonio")

    // A função filterTo() realiza um filtro dos elementos de uma coleção com base em um predicado
    // e armazena os elementos que correspondem ao critério em uma outra coleção.
    listaB.filterTo(listaA, { it.contains("a") })
    //println(listaA)

    // numerosPares()
    // mesclandoLista()
    // numerosImpares()
    funcaoSetOf()
}

fun funcaoSetOf() {

    // Com a função setOf() cria-se uma lista imutavel que não permite que elementos repetidos sejam mostrados
    val lista = setOf(1, 2, 1, 3, 4, 3)
    println(lista)

    // Com a função mutableSetOf() cria-se uma lista multavel que não permite que elementos repetidos sejam mostrados
    val listaA = mutableSetOf(1, 2, 1, 3, 4, 3)
    listaA.add(4)
    listaA.add(5)
    listaA.remove(0)
    lista.plus(6)
    println(listaA)
}

// Usando o metodo filter para filtra os elementos impares da coleção
fun numerosImpares() {
    val numeros = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val numerosImpares = numeros.filter { numeros ->
        numeros % 2 != 0
    }
    println(numerosImpares)
}

fun mesclandoLista() {
    val numberosPares = listOf(2, 4, 6, 8, 10)
    val numerosImpares = listOf(1, 3, 5, 7, 9)

    val todosNumeros = listOf(numberosPares, numerosImpares).flatten()
    //println(todosNumeros)

}

fun numerosPares() {
    val numeros = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val numerosPares = mutableListOf<Int>()

    // Usando o filterTo() para filtar numeros pares e armazena-los em numerosPares
    numeros.filterTo(numerosPares, { it % 2 == 0 })
    //println(numerosPares)
}
