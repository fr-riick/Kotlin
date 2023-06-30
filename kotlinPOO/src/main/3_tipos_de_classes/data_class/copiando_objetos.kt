package data_class

fun main() {
    // quando temos uma data class é possivel criar um objeto copiando todos os dados de outro objeto, modificando
    // apenas os atributos desejados, no exemplo a seguir eu crio o segundo funcionário apenas modificando o lastName

    var fun1 = funcionario("Rick", "Fernandes", "Vendedor")
    println("Funcionário 1: $fun1")

    var fun2 = fun1.copy(lastName = "Jhonson")
    println("Funcionário 2: $fun2")
}

data class funcionario (var name: String, var lastName: String, var cargo: String){
}