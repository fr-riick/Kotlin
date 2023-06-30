// Classes abstratas não podem ser instanciadas, servem apenas como molde pras classes filhas
abstract class Artist(var nome: String){
    // uma função abstract serve para que seus filhos tenham que sobreescrever esse função
    abstract fun apresentacao()

    // classes abstratas tbm podem ter métodos fixos, que não precisam ser sobreescritos e vai ser igual pra todas
    // as suas classes filhas
    fun darAutografo(){
        println("Toma meu autografo #$nome")
    }
}

class Vocalist(nome: String): Artist(nome){
    override fun apresentacao(){
        println("Olá meu nome é $nome e eu canto")
    }
}

class Dancer(nome: String): Artist(nome){
    override fun apresentacao() {
        println("Olá meu nome é $nome e eu danço")
    }
}

// como no exemplo abaixo, classes abstracts não precisam sobreescrever os métodos da sua classe pai
abstract class Jogador(nome: String, var esporte: String): Artist(nome)

// o jogador de futebol herda de jogador que herda de Artist, como não é uma classe abstrata tem que sobreescrever
// o método apresentacao
class JogadorFutebol(nome: String, esporte: String): Jogador(nome, esporte){
    override fun apresentacao() {
        println("Meu nome é $nome e sou jogador de $esporte")
    }
}


fun main() {

    var cantor = Vocalist("Maria")
    cantor.apresentacao()
    cantor.darAutografo()

    var dancarino = Dancer("Rick")
    dancarino.apresentacao()

    var futebolista = JogadorFutebol("Bredy", "Futebol")
    futebolista.apresentacao()
}