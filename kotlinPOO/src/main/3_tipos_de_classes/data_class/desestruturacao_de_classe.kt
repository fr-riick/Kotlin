package data_class

fun main() {
    val userA = User1("Rick", true)

    // se for um data class consigo desetruturar seus dados tem variaveis, assim tendo mais facil acesso a seus dados
    val (name, isAdmin) = userA
    println("Meu nome é $name e meu status de admin é: $isAdmin")

    
}

data class User1(var nome: String, var isAdmin: Boolean) {

}