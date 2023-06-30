fun main() {
    val numbers = listOf(1, 2, 3, 4)

    numbers.forEach{element ->
        println(element)
    }

    // aqui eu pego cada elemento da lista e executo a lógica
    for (number in numbers ){
        print("#$number ")
    }
    println()

    // consigo fazer o for pelo índice
    // nesse exemplo ele vai do indice 0 até o índice final especificado, nesse caso o numbers.lastIndex que é
    // um método pra pegar o último index da sua lista
    for (index in 0..numbers.lastIndex){
        print("${numbers[index]} ")
    }
    println()

    // ja nesse caso colocando a palavra reservada "until" ele não inclui o range final, nesse caso o "4"
    for (index in 0 until 4){
        print("|$index")
    }
    println()

    // com o step consigo pular índices indo de 2 em 2 por exemplo
    for(i in 0..10 step 2){
        print("N#$i ")
    }
    println()

    // se quiser fazer ao contrario decrementando
    for(i in 5 downTo 0){
        print("$i ")
    }
    println()



}