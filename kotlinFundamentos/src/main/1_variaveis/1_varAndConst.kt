fun main(){
    // Declaração de uma variável
    var age: Int = 24
    var height: Double = 1.8

    // Constantes são variaveis que não mudam, ai é só colocar "val" ao invés de "var"
    val name: String = "Gustavo"
    val isMen: Boolean = true
    // você pode especificar o tipo ou esconder pro próprio kotlin inferir
    val lastName = "Fernandes"
    val sexo: Char = 'M'

    println("""
        name    : $name
        lastName: $lastName
        age     : $age
        height  : $height
        isMen   : $isMen
        sexo:   : $sexo
    """.trimIndent())

}