package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    // `Any` é uma superclasse raiz de todas as classes no Kotlin, ou seja,
    // toda classe em Kotlin herda de `Any`, diretamente ou indiretamente.
    // # Hierarqui de objetos e exceptions

    val obj: Any = "Koltin"
    val obj2: Any = 888
    val obj3: Any = true

    val exemple: Any = getObject(2)
    // fazendo validação do objeto se é string ou não para ter acesso as propriedades da string
    if (exemple is String)
        println(exemple.length)
    else
        println("O objeto não é uma String")

    // Convertendo de forma explicita o obejeto para ums String
    val catObjectToString = exemple as String
    println(catObjectToString)

}

fun getObject(value: Int): Any {
    return when (value) {
        1 -> 1
        2 -> "Kotlin"
        3 -> true
        else -> 1.0
    }
}