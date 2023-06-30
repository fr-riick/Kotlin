// é como se fosse uma classe que só pode instaciar um único objeto
// suas propriedades podem ser utilizadas em qualquer lugar
// geralmente utilizado pra colocar todas as constantes do seu app
object Singleton {
    lateinit var pessoa: Pessoa

    fun saudation(){
        println(pessoa.saudacao())
    }
}