package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val number = listOf(1, 2, 3, 4, 5)
    val numbers = listOf(6, 7, 8, 9, 10)

    for (number in numbers) {
      //  println(number)
    }
    // range de numeros
    for (index in 0 until 3) {
      //  println("index: $index, elemento ${number[index]}")
    }

    // ranger de numeros com inclusão
    for (index in 0..3 ) {
     //   println("index: $index, elemento ${number[index]}")
    }

    // ranger crescente com sequencia em etapa
    for (item in 0 until 20 step 2) {
     //   println("N#: $item")
    }

    // range decrescente com sequencia em etapa (2 em 2)
    for (item in 20 downTo 0 step 2) {
        println("N#: $item")
    }

    // range decrescente
    for (item in 20 downTo 0) {
      //  println("N#: $item")
    }

    var n = 0
    while (n < 10) {
        println(n)
        n++
    }
}