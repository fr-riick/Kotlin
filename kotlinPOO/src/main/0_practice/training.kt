
abstract class Mamifero(var nome: String){
    abstract fun info()
}

abstract class Humano(nome: String, var idade: Int): Mamifero(nome)

class Rick(nome: String, idade: Int, var cpf: String): Humano(nome, idade){
    override fun info() {
        println("Nome: $nome, Idade: $idade, cpf: $cpf")
    }
}
fun main() {

    var rick = Rick("Rick", 24, "1212121")
    rick.info()
}

