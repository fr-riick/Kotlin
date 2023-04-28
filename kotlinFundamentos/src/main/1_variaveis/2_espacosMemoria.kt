fun main() {

    // Espaços de memória em tipos primitivos

    //Inteiros:
    // O padrão é Int
    var intPequeno: Byte = 8 // 8 bits
    var intMedio: Short = 16 // 16 bits
    var intPadrao: Int = 32  // 32 bits
    var intMaior: Long = 64  // 64 bits

    // Se colocar um "L" dps do número vc reserva espaço pra um long
    var numGrande = 169L
    // pode separar os números grandes por "_" para facilitar a leitura
    var numComAnderlaine = 1_200_350

    // Decimais:
    // Padrão é o double
    var decPequeno: Float = 3.14f  // 32 bits
    var decPadrao: Double = 300.14 // 64 bits

    // Char
    var umaLetra: Char = 'M' //16 bits

}