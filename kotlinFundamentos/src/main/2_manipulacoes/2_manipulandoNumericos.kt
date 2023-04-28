fun main() {
    var numStr: String = "5"
    // .to para converter pro tipo desejado
    var numInt = numStr.toInt()
    println(numInt)
    var numDouble = numStr.toDouble()
    println(numDouble)

    // tratamento para excessão na conversão

    var str = "10a"

    // .toIntOrNull()
    // tenta converter se não conseguir retorna null
    val parsedNull = str.toIntOrNull()

    if (parsedNull != null) {
        println("não é nulo")
    } else {
        println("é nulo")
    }

    // Ou usando um try catch
    try {
        val parsedInt = str.toInt()
        println("The parsed int is $parsedInt")
    } catch (nfe: NumberFormatException) {
        println("não foi possível converter")
    }

    // também pode usar o ?: que se for null ele atribui um valor
    // nesse exemplo ele atribui zero
    val num = "5a"
    val numDefault = num.toIntOrNull() ?: 0
    print(numDefault)
}