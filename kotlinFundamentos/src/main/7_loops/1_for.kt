fun main() {
    val numbers = listOf(1, 2, 3, 4)

    numbers.forEach{element ->
        println(element)
    }

    for (number in numbers ){
        print("#$number ")
    }
    println()

    for (index in 0..numbers.lastIndex){
        print("-$index ")
    }
    println()

    for (index in 0..3){
        print("|$index")
    }


}