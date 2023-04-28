fun main() {

    val primeiroNome = "Bredy"
    val segundoNome = "Jhonson"
    val nome = "Gustavo Enrique"


    // Interpolação de Strings
    // Coloca o símbolo de Cifrão($) antes da variavel para interpolar strings
    // e outras coisas simples como uma soma, assim não precisa concatenar as
    // strings.
    println("O nome completo é: $primeiroNome $segundoNome");
    // caso vc vá colocar a variavel junto com um método vc acrescenta chaves
    // junto ao cifrão, exemplo:
    println("O nome é ${nome.uppercase()}");

    // length
    // Retorna o tamanho da String
    println("O primeiro nome tem ${primeiroNome.length} caracteres")

    // Substring
    // Pega a String a partir do caractere informado
    println(nome.substring(8));
    // Você pode informar o caractere inicial e final, como no exemplo a seguir
    println(nome.substring(0, 7));

    // startsWith endsWith
    // Verifica se a String começa ou termina com o parâmetro indicado
    println(nome.lowercase().startsWith("gus"));
    println(nome.endsWith("que"));

    // contains
    // verifica se a string contém o parâmetro em qualquer lugar dela
    println(nome.contains("Enrique"));

    // split
    // quebra uma string por um caractere passado como parâmetro e transforma
    // em uma lista
    var paciente = "Gustavo Enrique|24|Estudante";
    var dadosPaciente = paciente.split('|');
    println(dadosPaciente);
    var idadePaciente = dadosPaciente[1];
    println(idadePaciente);


}