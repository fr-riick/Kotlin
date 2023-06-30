fun main() {
    var nomes = mutableListOf<String>("Rick", "Lucas", "Jorge")

//     Método size: diz o tamanho da lista
//     ou count, que conta quantos elementos tem a lista
    println("O tamanho da lista de nomes é: ${nomes.size}")
//    println("O tamanho da lista de nomes é: ${nomes.count()}")

//     Método isEmpty ou isNotEmpty
//     Verifica se a lista está vazia ou se não está vazia
    println("")
    println("Lista vazia? ${nomes.isEmpty()}")
//    nomes.isNotEmpty()

//    Método first e last
//    retorna o primeiro ou o ultimo item da lista
    println("")
    println("O ultimo item da lista é ${nomes.last()}")

//    Método contains
//    verifica se contém na lista
    nomes.contains("Rick")

//    Método sorted
//    ordena a lista ou alfabetica ou crescente
    println("")
    println("nomes Ordenados")
    println(nomes.sorted())

//     Método asReversed
//     deixa a lista invertida
    println("")
    println("nomes invertidos")
    println(nomes.asReversed())

//     Método add: adiciona no final da lista
    println("")
    println("Adicionando o nome carlos e Bredy na lista")
    nomes.add("Carlos")
//     pode ser adicionado em um índice específico
    nomes.add(1, "Bredy")
    println(nomes)

//     Método remove: remove um item da lista
    nomes.remove("Carlos")
    println("")
    println("Removendo Carlos e Bredy da lista")
//    pode ser removido por um índice também
    nomes.removeAt(1)
    println(nomes)

    // Método filter e filterNot
    // filtra os elementos da lista
    val a = listOf(1, 2, 5, 6, 7)
    val filtred = a.filter { it > 3 }
    println(filtred)

    // filtra os que não estão na regra de negócio
    val filtredNot = a.filterNot { it > 3 }
    println(filtredNot)






}