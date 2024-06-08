fun main() {
    // Arrays de tamanhos fixos
    val numbers = intArrayOf(1, 2, 3, 4, 5, 6)
    val newNumber = numbers.plus(7)
    numbers.forEach { numbers ->
       // println(numbers)
    }

    // Criando o array de usuario
    val users = arrayOf(
        User("Marcelo", true),
        User("Thiago", false),
        User("Manoel", false)
    )

    users[0] = User("Soares", true)

    users.forEach { users ->
       // println(users)
    }

    // Atualizando o usuario
    val newList = users.plus(User("Soares", true))
    newList.forEach {
       // println(it)
    }

    // Realizando busca
    //println(newList[1])

    newList[3] = User("Soares", false)
    newList.forEach {
        //println(it)
    }

    // Arrays de tamanhos dinamicos de escrista

    val usersList = mutableListOf<User>(
        User("Marcelo", true),
        User("Thiago", false),
        User("Manoel", false)
    )
    usersList.forEach {
        println(it)
    }
    println("====================")

    // Adicionando uma novo usuario a lista sem criar uma nova lista
    usersList.add(User("Calos", false))
    println(usersList)
    println("====================")

    // Atualisando o usuario lista
    usersList[0] = User("Lima", true)
    println(usersList)

    println("====================")
    // Removendo usuario da lista atraves do indice
    usersList.removeAt(0)
    println(usersList)
}