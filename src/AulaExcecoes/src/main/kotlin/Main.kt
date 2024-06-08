package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    // Lançando excecoes com `throw e try...cath` para captura e tratamento de erros de forma
    // controlada evitando que a aplicação tremine(crash) abruptamente.

    showView()

}

fun showView() {
    try {
        val result = discount(100.0, 51)
        println(result)
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }
}

fun discount(price: Double, valeu: Int): Double {
    if (valeu > 50) {
        throw IllegalArgumentException("Desconto muito alto!")
    }

    val discount = valeu * price / 100
    return price - discount
}