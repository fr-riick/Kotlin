// open class
// a classe só pode ter filhos se colocar o open antes da declaração da classe
open class Animal(val name: String) {

    // caso eu queira que uma propriedade seja acessada apenas pelos seus filhos usar a palavra protected
    protected var isMammal = false

    // o open fun permite que eu crie uma função que pode ser sobreescrita apenas se eu quiser, diferente do abstract,
    // que você é obrigado a sobreescrever
    open fun makeSound() {
        println("O animal faz um som. É mamífero? $isMammal")
    }
}

// pra herdar de uma classe, você precisa dps do construtor da classe colocar dois pontos e a classe super com
// seus atributos
class Cat(name: String, var cor: String) : Animal(name) {
    init {
        isMammal = true
    }
    override fun makeSound() {
        println("O gato é $cor, e ele mia. É mamífero? $isMammal")
    }
}


fun main() {
    val animal = Animal("Animal")
    val cat = Cat("Mimi", "Preto")

    animal.makeSound() // Saída: O animal faz um som.
    cat.makeSound()    // Saída: O gato mia.
}