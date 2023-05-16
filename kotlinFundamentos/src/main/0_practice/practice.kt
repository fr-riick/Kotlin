
fun main() {
    var listaImutavel = mutableListOf(1, 2, 3, 4, 5)
    val somaDaLista = somaList(listaImutavel)
    println(somaDaLista)

}

fun somaList(lista: List<Int>): Int{
    var result = 0
    for (number in lista){
        result += number
    }
    return result
}
