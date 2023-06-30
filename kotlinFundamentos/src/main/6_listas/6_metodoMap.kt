fun main() {
    // map
    // servem pra retornar uma nova lista com a lógica necessária

    var namesList = listOf("Rick", "Jorge", "Lucas", "Maria")

    // aqui eu retorno uma nova lista com os nomes em capslock
    var namesCapsLock = namesList.map {
        names -> names.uppercase()
    }
    println(namesCapsLock)

    // é possível usar métodos diferentes ao mesmo tempo
    // aqui eu retorno todos os nomes em capslock e depois filtro apenas os nomes que tem a letra "A" em algum lugar
    var newNames = namesList.map { it.uppercase() }
                            .filter { it.contains("A") }
    println(newNames)

}