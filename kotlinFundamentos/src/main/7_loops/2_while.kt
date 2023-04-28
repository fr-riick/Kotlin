fun main() {
    var i = 0

    // While
    // só executa se a condição for verdadeira
    println("while")
    while (i < 5){
        print("$i ")
        i++
    }

    // do While
    // executa uma vez antes de verificar a condição
    println("\ndo while")
    do {
        println(i)
        i++
    } while (i < 3)
}