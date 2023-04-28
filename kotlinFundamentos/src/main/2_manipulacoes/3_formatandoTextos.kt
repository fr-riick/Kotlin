fun main() {
    // 1- pula linha com \n
    val message = "Olá Rick. \nSeu produto chegou"
    println(message)
    println("")

    // 2- aspas triplas, pode ter varias linhas
    // o .trimIndent() é pra ficar tudo identado e a formatação n ficar com espaço onde ta identado
    var message2 = """
        printando
        varias 
        linhas
    """.trimIndent()
    println(message2)
    println("")

    // 3- Método replaceIdent()
    // troca a identação por um caractere específico
    var message3 = """
        printando
        varias 
        linhas
    """.replaceIndent(";")
    println(message3)
    println("")


}