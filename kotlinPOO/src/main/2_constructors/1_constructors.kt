fun main() {
    // usando o construtor 1
    val c1 = Cachorro("Shitsu", "Pequeno Porte")
    println(c1.output)

    // usando o construtor 2
    val c2 = Cachorro("Médio Porte")
    println(c2.output)

    // usando o método da classe pra resetar o contador, como podemos ver não é necessário de um objeto
    // pra acessar esse método, ja acesa com o nome da classe
    Cachorro.resetCount()
    println("O contador de objetos foi resetado para: ${Cachorro.count}")

}
