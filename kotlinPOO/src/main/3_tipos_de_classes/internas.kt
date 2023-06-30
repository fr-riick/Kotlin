fun main() {
    var bredy = Musician2()
    bredy.desc()

    var guitar = bredy.Guitar()
    guitar.desc()
}

class Musician2 {
    var style = "rock"
    fun desc() = println("O estilo do músico é: $style")

    // Com o inner class, a classe Guitar tem acesso aos atributos da classe Musician2
    // mas é necessário instanciar primeiro um objeto de Musician2 pra dps um de guitar
    inner class Guitar{
        var strings = 6
        fun desc() = println("A guitarra tem $strings cordas e toca $style")
    }

}