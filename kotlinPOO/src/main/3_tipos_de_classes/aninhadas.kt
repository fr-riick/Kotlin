fun main() {
    var musician1 = Musician.Guitar()
    musician1.desc()
}

// Classes aninhadas
// podemos ter uma classe dentro de outra ficando mais visível que a guitarra pertence ao musico
class Musician {
    var style = "rock"
    fun desc() = println("O estilo do músico é: $style")

    class Guitar{
        var strings = 6
        fun desc() = println("A guitarra tem $strings cordas")
    }

}