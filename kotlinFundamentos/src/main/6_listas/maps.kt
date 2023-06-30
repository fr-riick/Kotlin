fun main() {
    // map
    // é tipo uma lista com chave e valor
    // da pra ser imutavel ou mutavel - mapOf() mutableMapOf

    // a chave e valor podem ser tipos diferentes
    var product = mutableMapOf(
        1 to "Celular",
        2 to "Computador",
        3 to "Tablet"
    )
    println(product[1])

    // Alguns métodos dos maps

    // contains
    // verifica se contain aquela chave ou valor
    println(product.containsKey(3))
    println(product.containsValue("PC"))

    // keys, values
    // consultar as chaves e valores
    println("keys: ${product.keys}")
    println("values: ${product.values}")

    println("map ${product}")

    // é possível atualizar os dados de uma chave se for um mutableMap
    product[3] = "Joystick"
    println("atualizando o produto de chave 3")
    println("map ${product}")

    // também da pra adicionar novos
    product[4] = "teste"
    println("adicionando o produto 4")
    println(product)

    // e remover algum existente
    product.remove(4)
    println("removendo o produto 4")
    println(product)

    // clear pra limpar o map inteiro
    // product.clear()


}