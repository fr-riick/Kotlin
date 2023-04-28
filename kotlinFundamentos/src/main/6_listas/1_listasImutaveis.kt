fun main() {
    // não da pra adicionar novos itens nas listas ou arrays imutaveis
    // por isso não temos os métodos de add, ou de remove
    
    // Array
    val arrayImutavel = arrayOf(1, 2, 3, 4)
    println(arrayImutavel[0])

    // List
    val listaImutavel = listOf(1, 2, 3, 4, 5)
    print(listaImutavel)

    // Lista ou arrays vazios
    // Temos duas formas
    // É necessário especificar o tipo nesse caso pois como é vazia o Kotlin não consegue inferir

    // Lists
    val listaImutavelVazia = listOf<String>()
    val listaImutavelVazia2: List<String> = listOf()

    // Arrays
    val arrayImutavelVazio = arrayOf<String>()
    val arrayImutavelVazio2: Array<String> = arrayOf()
}