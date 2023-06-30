fun main() {
    divide("x", "2")
}

// tryCatch
// ele tenta executar o que está no try caso não consiga cai no catch respectivo da exception que deu

// A exceção default que pega todas as exceções é a Exception que usei por último.
// ou seja, ela pega qualquer exceção e trata, por isso tem que ser a última, pois se não encaixar em nenhuma exeção
// anterior, cai nela
fun divide(x: String, y: String){
    try {
        val a = Integer.parseInt(x)
        val b = Integer.parseInt(y)
        println(a / b)
    } catch (e: NumberFormatException){
        println(e.message)
    } catch (e: ArithmeticException){
        println("não é possível dividir por zero")
    } catch (e: Exception){
        println("algo está errado")
    }
}