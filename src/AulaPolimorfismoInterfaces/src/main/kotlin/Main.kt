package org.example
import org.example.Empresas.McDonald
import org.example.Instrumentos.Guitarra
import org.example.Interface.LoggerGenerico
import org.example.Interfaces.Menu
import org.example.Interfaces.Tocavel
import org.example.SysLogger.SistemaArquivo
import org.example.SysLogger.SistemaConsole

fun main() {
    /*val marcelo = Pessoa("Marcelo")
    val musico1 = Musico(marcelo.nome)
    musico1.tocavel = buscarInstrumento()
    musico1.starPlay()*/

    /*val cliente = Pessoa("Luan")
    val cliente1 = Cliente(cliente.nome)
    cliente1.menu = getMenu()
    cliente1.fazerPedido()*/

    /*val userA = Usuario(getSistemaDeLog())
    userA.criarPublicacao()*/


    val userB = Usuario(getSistemaDeLog(1))
    userB.criarPublicacao()

}

// Exemplo usado usando tipos de instrumentos
fun buscarInstrumento(): Tocavel {
    return Guitarra()
}

// Exemplo usado para pazer pedido de um lanche
fun getMenu(): Menu {
    return McDonald()
}

// Exemplo de sistema de log do Instagram para registro no (Console | Arquivo .txt)
fun getSistemaDeLog(opc: Int): LoggerGenerico {
    return SistemaArquivo()
}

