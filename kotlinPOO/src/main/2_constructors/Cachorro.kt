// O construtor vem logo após a criação da classe
// Você cria os atributos ja passando eles como parametro do construtor da classe
class Cachorro (val raca: String, val tamanho: String){

    val output = "Raça: $raca, Tamanho: $tamanho"

    // Companion object é pra criar uma propriedade ou comportamento da classe ( não do objeto )
    // nesse exemplo crio um contador e toda vez q é criado um novo objeto incremento esse contador
    // no init do construtor. Sendo assim é possivel ver quantos objetos existem dessa classe
    companion object {
        // val - tempo de execução
        // const val - Tempo de compilação
        const val numeroQueNaoMuda = 3

        var count = 0

        fun resetCount(){
            count = 0
        }
    }

// init
// executa esse bloco quando o construtor principal é chamado
    init {
        count++
        println("Existem $count objetos da classe Cachorro")
    }

// sobrecarga de construtor
// voce passa apenas os parametros que você deseja e depois coloca o this pra chamar o construtor principal passando
// os parametros do novo construtor e completando os outros que faltam do construtor principal
    constructor(tamanho: String) : this ("Vira lata", tamanho){
    }


}