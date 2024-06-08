package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    /*
    LISTAS IMUTAVEIS | LISTAS MUTAVEIS
    listOf() -> mutableListOf()
    setOf() -> mutableSetOf()
    mapOf() -> mutableMapOf()
     */
    // utilizando a função mapOf() para trabalhar com Chave -> Valor imutaveis
    val product = mapOf(
        // CHAVE      VALOR
        "Android" to "Google",
        "iOS" to "Apple",
        "Windows" to "Microsoft"
    )

    product.forEach {
        println("Chave: ${it.key} -> Valor: ${it.value}")
    }

    // Especificando um valor padrão(Default) caso seja especificado uma chave inexistente
    // usando a função getOrDefault()
    val res = product.getOrDefault("Android2", "Valor inexistente")
    println(res)


    // utilizando a função getOrElse() para realizar um processamento antes de apresentar uma mensagem na tela
    val result = product.getOrElse("Android3") {
//        println("Realizando comunicação com servidor!")
        "O valor informado é inexistente!"
    }
//    println(result)


    // utilizando o metodo containsKey() para verificar se contem uma chave ou valor onde o retorno é um boolean
    val hasProduct = product.containsKey("Windows")
    if (hasProduct) {
//        println(hasProduct)
    } else {
//        println(hasProduct)
    }

    val session = mapOf(
        "token" to "34567136576838sfklhjs35622"
    )
    val hasToken = session.containsKey("token")
    if (hasToken) {
//        println("Exibir tela principal do app")
    } else {
//        println("Exibir tela de login para o usuário")
    }

    // utilizando a função mutableMapOf() para trabalhar com Chave -> Valor mutaveis
    val codeBar = mutableMapOf(
        789103050 to "Arroz",
        789245790 to "Feijão",
        789903256 to "Açucar"
    )
    codeBar.forEach {
        println("EAN: ${it.key} -> Produto: ${it.value}")
    }

    println("=======================")
    // alterando a descrição do produto
    codeBar[789903256] = "Açucar Delta"
    codeBar.forEach {
        println("EAN: ${it.key} -> Produto: ${it.value}")
    }

    println("=======================")
    val contactsGmail = mapOf(
        1 to "Marcelo",
        2 to "Maria",
        3 to "João",
        4 to "Carlos",
        5 to "Ana",
        6 to "Raimunda"
    )
    val results = contactsGmail
        .filter { it.value.contains("a") }
        .map { it.value.substring(0, 1) }
    println(results)

}