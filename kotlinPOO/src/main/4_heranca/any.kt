fun main() {
    // Any
    // é o objeto pai de todos, ou seja any é tudo
    val objeto: Any = getObject(2)

    // para poder por exemplo usar um método exclusivo de uma string, preciso verificar se o tipo da variavel que
    // recebeu o retorno da função any, é uma string
    if (objeto is String){
        println(objeto.length)
    }

}

// essa função retorna um any, ou seja pode retornar qualquer tipo
fun getObject(value: Int): Any{
    return when(value){
        1 -> 1
        2 -> "palavra"
        3 -> true
        else -> 1.5
    }
}