fun main() {
    // não da pra adicionar novos itens nas listas ou arrays imutaveis
    // por isso não temos os métodos de add, ou de remove
    
    // Array genérico, sem tipo específico geralmente usados para strings ou objetos
    val arrayImutavel = arrayOf(1, 2.3, "a")
    println("Array genérico")
    // for each é como se fosse um for normal que passa por cada item da lista, pra utilizar os itens tem a palavra
    // reservada "it" ou você pode declarar uma palavra colocando ela e uma seta pro lado, exemplo: (item ->)
    arrayImutavel.forEach { print("$it ") }
    println()

    // como são listas imutáveis para adicionar um novo item pode-se usar o método plus, porém precisa criar
    // uma nova variável
    val newArray = arrayImutavel.plus(5)
    println("novo array adicionando o item 5")
    newArray.forEach { print("$it ") }
    println()

    val inteiros = intArrayOf(5, 4, 3)
    println("Array inteiros")
    inteiros.forEach { print("$it ")}
    println("")

    val doubles = doubleArrayOf(3.5, 4.7, 5.1)
    println("Array double")
    doubles.forEach { number -> print("$number ") }
    println()

    // List
    // uma das diferenças do list é que ele é só para leitura ou seja, uma lista imutável não pode adicionar
    // novos itens assim como no array, e diferente do array não pode atualizar os dados ja existentes
    val listaImutavel = listOf(1, 2, 3, 4, 5)
    println("Lista imutavel")
    print(listaImutavel)

    // Lista ou arrays vazios
    // Temos duas formas
    // É necessário especificar o tipo nesse caso pois como é vazia o Kotlin não consegue inferir
    // Pode usar o array especifico, ex: intArrayOf() ou colocar o tipo como nos exemplos a seguir

    // Arrays
    val arrayImutavelVazio = arrayOf<String>()
    val arrayImutavelVazio2: Array<String> = arrayOf()

    // Lists
    val listaImutavelVazia = listOf<String>()
    val listaImutavelVazia2: List<String> = listOf()


}