package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    /*println("Calculadora")
    println(
        """
        Selecione o tipo de operação:
        1 - Soma
        2 - Subtração
        3 - Multiplicar
        4 - Dividir
    """.trimIndent())
    val operation = readln().toInt()

    if (operation > 4 || operation == 0) {
        println("Operação invalida!")
        main()
    } else {
        operation(operation)
    }*/

    /*val operations = listOf(::sum, ::minus, ::multiply, ::divide)
    operations.forEach { operation ->
        println(calc(20, 2, operation))
    }*/

    calc(10, 10) {x, y -> x + y}
    calc(10, 10) {x, y -> x - y}
    calc(10, 10) {x, y -> x * y}
    calc(10, 10) {x, y -> x / y}
}

/*private fun operation(operation: Int) {
    println("Informe um numero:")
    val numberA = readLine()!!.toInt()
    println("Informe outro numero:")
    val numberB = readLine()!!.toInt()

    when (operation) {
        1 -> calc(numberA, numberB, ::sum)
        2 -> calc(numberA, numberB, ::minus)
        3 -> calc(numberA, numberB, ::multiply)
        4 -> calc(numberA, numberB, ::divide)
        else -> {
            println("")
        }
    }
}*/

fun calc(x: Int, y: Int, operation: (Int, Int) -> Int) {
    return println("O resultado da operação é: ${operation(x, y)}")
}

/*fun sum(x: Int, y: Int): Int {
    return x + y
}

fun minus(x: Int, y: Int): Int {
    return x - y
}

fun multiply(x: Int, y: Int): Int {
    return x * y
}

fun divide(x: Int, y: Int): Int {
    return x / y
}*/
