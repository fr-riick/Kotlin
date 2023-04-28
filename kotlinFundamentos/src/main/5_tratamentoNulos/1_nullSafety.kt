fun main() {
    // variaveis não podem receber nulo, para poder receber nulo faça como no exemplo a seguir colocando a interrogação
    // após o tipo da variável:
    var name: String? = null

    // Colocando a interrogação depois da variavel, ele verifica se a variavel é nula, se for ele retorna null,
    // se não for ele executa o método
    println(name?.length)

    // Você também pode garantir pro kotlin que sua variavel não é nula colocando duas exclamações depois do nome
    // da variavel. Isso não é recomendável e deve ser usado o minimo possivel
    val saudacao: String? = "Olá Mundo"
    println(saudacao!!.lowercase())

    // null aware operator (operador elvis) ?:
    // verifica se é nulo, se for atribui um valor padrão
    var lastName = " Enrique"
    // var nomeCompleto = if (name != null) name + "Enrique" else "Gustavo Enrique"
    var fullName = (name ?: "Gustavo") + lastName
    println(fullName)

    // Juntando os dois
     var phrase: String? = null
     println(phrase?.uppercase() ?: "Frase não preenchida")

}