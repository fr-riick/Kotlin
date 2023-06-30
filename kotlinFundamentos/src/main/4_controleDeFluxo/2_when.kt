fun main() {

    // When
    // Como se fosse o switch case

    var patas = 9

    when (patas){
        2 -> println("é bipede")
        4 -> println("é quadrupede")
        6, 7 -> println("é aranha") // 6 e 7
        in 8..10 -> println("é alienígena") // vai de 8 até 10
        else -> { // como se fosse o default
            print("não conhecido")
        }
    }

    // when tbm da pra retornar um resultado para uma variavel

    val number = 10
    val numberSize = when (number) {
        in 1 .. 5 -> "Menor ou igual a 5"
        else -> "Maior que 5"
    }
    println(numberSize)
}