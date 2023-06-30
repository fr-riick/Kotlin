fun main() {
    showView()
}

//Throw "exceção"
// lança uma exceção
// nesse exemplo lança se o desconto for maior que 50
fun Discount(price: Double, value: Int): Double{
    if (value > 50){
        throw IllegalArgumentException("desconto muito alto!")
    }
    val discount = value * price / 100
    return price - discount
}

// aqui eu trato a exceção que é lançada caso o desconto seja maior que 50
fun showView(){
    try {
        val res = Discount(100.0, 51)
        println(res)
    } catch (e: IllegalArgumentException){
        println(e.message)
    }

}