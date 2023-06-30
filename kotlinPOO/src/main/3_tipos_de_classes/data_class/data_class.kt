package data_class

fun main() {
    var user1 = User("Rick", true)
    var user2 = User("Rick", true)

    // usando o data class são os atributos da classe que serão comparados, e por isso o resultado é true
    // se fosse uma classe normal, compararia os objetos, veria que são diferentes e daria false
    println(user1 == user2)
}

data class User(var name: String, var isAdmin: Boolean)
// é uma classe para estrutura de dados
// geralmente usamos data class quando queremos trabalhar com os atributos do objeto, e não com o objeto em si