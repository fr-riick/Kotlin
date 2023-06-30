fun main() {
    var obama = Obama()
    obama.direitoDeveres()
    obama.ganhouEleicao()


}

interface Presidente{
    fun ganhouEleicao()
}

open class Cidadao {
    fun direitoDeveres(){
        println("Todo cidadao tem direitos e deveres")
    }
}

class Obama: Cidadao(), Presidente{
    override fun ganhouEleicao() {
        println("ganhou a eleiçao nos EUA")
    }
}

class Lula: Cidadao(), Presidente {
    override fun ganhouEleicao() {
        println("ganhou a eleiçao no Brasil")
    }
}

