fun main() {
    val num1 = 3
    val num2 = 2

    if (num1 == num2){
        println("é igual")
    } else if (num1 > num2){
        println("$num1 é maior que $num2")
    } else {
        println("$num1 é menor que $num2")
    }

    // Da pra usar um if como expressão
    // parecido com if ternário
    // exemplo:

    if (1==1) println("é igual") else println("é diferente")
}