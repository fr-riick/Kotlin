// modularização
// seria em um arquivo ter varias classes

// internal faz com que a classe só seja visível para esse módulo, ou seja só para esse arquivo
internal class Cordas(var qtdCordas: Int)

open class Instrumento(var cor: String){

    // a propriedade cordas é privada e por isso criei um método para poder altera=la
    // assim ela não é visivel fora da classe, isso é bom qd eu for criar uma biblioteca ou algo do tipo e outras
    // pessoas n terem acesso a alguma determinada coisa
    private lateinit var cordas: Cordas

    fun console(){
        println("Esse instrumento é da cor $cor e tem ${cordas.qtdCordas} cordas")
    }

    // método criado para alterar o número de cordas, é um encapsulamento
    fun addCordas(num: Int){
        cordas = Cordas(num)
    }
}

class Guitarra(cor: String) : Instrumento(cor){
    init {
        // assim que crio uma guitarra, ja seto o número de cordas pra 6
        addCordas(6)
    }
}