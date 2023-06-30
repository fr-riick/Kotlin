package data_class

fun main() {
    // pair é um data class de 2 propriedades, pra quando for necessário usar uma estrutura de dados simples, exemplo
    // latitude e longitude, ou chave e valor

    var latLong = Pair(10, 20)

    println("a latitude é ${latLong.first} e a longitude é ${latLong.second}")

    // caso vá usar como chave e valor da pra fazer da seguinte maneira

    var usuarioPeloID = 1 to "Rick"
    println("O usuário de número ${usuarioPeloID.first} se chama ${usuarioPeloID.second}")

    // o triple é a msm coisa só que com 3 dados
    // se por exemplo num jogo 3d vc precisa do eixo x, y e z do personagem

    val triple = Triple(5, 10, 15)
    println("A posição do personagem o jogo é x: ${triple.first}, y: ${triple.second}, z: ${triple.third}")
}