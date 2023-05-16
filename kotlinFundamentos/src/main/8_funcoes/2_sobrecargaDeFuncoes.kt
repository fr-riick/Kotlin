fun main() {
    // Sobrecarga de funções
    // Pode existir várias functions com o mesmo nome desde que tenham parametros diferentes
    saudacao()
    saudacao(nome = "Rick")
    saudacao(nome = "Bredy", saud = "Hello")

}

fun saudacao() = println("Olá")
fun saudacao(nome: String) = println("Olá $nome")
fun saudacao(nome: String, saud: String) = println("$saud $nome")