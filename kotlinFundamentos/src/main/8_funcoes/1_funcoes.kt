fun main() {
    println(somar(y = 7))
    println(sub(5))
    val result = funcaoQueRecebeFuncao(3) { a -> 5 * a } // usei uma função lambda, é tipo uma func anonima
    println(result)
}

// se um parametro tiver valor default e não for o ultimo parametro é necessário colocar os parametros restantes
// nomeados quando chamar a funçao
fun somar(x: Int = 5, y: Int): Int{
    return x + y
}

// Se for uma função simples da pra fazer em uma linha
fun sub(x: Int): Int = 10 - x

// função que recebe outra func com parametro
// Aqui ele espera o seguintes parametros:
// x = que seria um número inteiro
// function = que é uma function que recebe um Int como parametro e returna Int
fun funcaoQueRecebeFuncao(x: Int, function: (Int) -> Int): Int {
    return function(x)
}

