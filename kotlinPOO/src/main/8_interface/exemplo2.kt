fun main() {
    val rick = Musico()
    rick.tocavel = buscarInstrumento()
    rick.startPlay()

}

fun buscarInstrumento(): Tocavel{
    return Bateria()
}

class Musico(){

    lateinit var tocavel: Tocavel
    fun startPlay(){
        tocavel.play()
    }
}


// A Interface é como se fosse um contrato, onde todas as classes que assinarem esse contrato precisam implementar
// tudo que tem na interface. Uma classe pode ter varias interfaces, basta colocar a vírgula e colocar a outra
interface Tocavel {
    fun play()
}

class Guitar: Tocavel{
    override fun play() {
        println("Tocando guitarra")
    }
}

class Bateria: Tocavel{
    override fun play() {
        println("tocando bateria")
    }
}
