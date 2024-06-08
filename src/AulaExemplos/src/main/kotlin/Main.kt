
fun main() {

    val button = Button("Salvar", Colors.RED.label, Pair(50, 20))
    val link = Link("Cadastre-se", Colors.BLUE.label, Pair(30, 15))

    render(button)
    println("\n************************************************\n")
    render(link)
}


fun render(component: Component) {
    component.render()
}

abstract class Component {
    abstract fun position(): Pair<Int, Int>

    open fun render() {
        println("Desenhando na tela nas posições eixo= X: ${position().first}, Y: ${position().second}")
    }
}

abstract class Text(val  text: String, var backgroundColor: String, val pos: Pair<Int, Int>): Component() {
    override fun render() {
        super.render()
        println("Componente com text: $text")
    }
}

class Button(text: String, backgroundColor: String, pos: Pair<Int, Int>): Text(text, backgroundColor, pos) {
    override fun position(): Pair<Int, Int> {
        return pos
    }
    override fun render() {
        super.render()
        println("Setando o background do componente com a cor: ${backgroundColor} | Code RGB: ${Colors.RED.codeColor}")
    }
}

class Link(text: String, backgroundColor: String, pos: Pair<Int, Int>): Text(text, backgroundColor, pos) {
    override fun position(): Pair<Int, Int> {
        return pos
    }
    override fun render() {
        super.render()
        println("Setando a cor do componente $text com a cor: ${backgroundColor} | Code RGB: ${Colors.BLUE.codeColor}")
    }
}

enum class Colors(val label: String, val codeColor: String) {
    RED("Vermelho", "0xFF0000"),
    GREEN("Verde", "0x00FF00"),
    BLUE("Azul", "0x0000FF")
}