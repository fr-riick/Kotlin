class Pessoa {
    // Atributos
    // private - variavel não fica visivel em outras classes
    private var name: String = ""
    var age: Int = 0
    // lateinit é você garantindo pro kotlin que você vai inicializar a variavel depois, assim não é necessário
    // inicializar já na criação ou fazer um tratamento com nulo
    lateinit var lastName: String

    // Métodos normais
    fun saudacao(){
        println("Olá, meu nome é $name $lastName e tenho $age anos de idade.")
    }

    // Métodos getter e setter
    fun getName(): String {
        return name
    }

    fun setName(newName: String){
        name = newName
    }
}
