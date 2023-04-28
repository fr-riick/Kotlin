fun main() {
    //! Detalhe sobre a String
    //! A String é composta por 4 campos (Nome|Idade|Profissão|Estado onde mora)
    val pacientes = listOf("Rodrigo Rahman|35|desenvolvedor|SP",
        "Manoel Silva|12|estudante|MG",
        "Joaquim Rahman|18|estudante|SP",
        "Fernando Verne|35|estudante|MG",
        "Gustavo Silva|40|desenvolvedor|MG",
        "Sandra Silva|40|Desenvolvedor|MG",
        "Regina Verne|35|dentista|MG",
        "João Rahman|55|jornalista|SP",)


    //! Baseado no array acima monte um relatório onde:
    //! 1 - Apresente os pacientes com mais de 20 anos e print o nome deles
    //! 2 - Apresente quantos pacientes existem para cada profissão (desenvolvedor, estudante, dentista, jornalista)
    //! 3 - Apresente a quantidade de pacientes que moram em SP

    var paciente20Anos = mutableListOf<List<String>>()
    var desenvolvedores = 0
    var estudantes = 0
    var dentistas = 0
    var jornalistas = 0
    var nomePaulistas = mutableListOf<String>()

    for (paciente in pacientes){
        val dadosPaciente = paciente.split("|")

        //! 1 - Apresente os pacientes com mais de 20 anos e print o nome deles
        var idade = dadosPaciente[1].toInt()
        if (idade > 20){
            paciente20Anos.add(listOf(dadosPaciente[0], dadosPaciente[1]))
        }

        //! 2 - Apresente quantos pacientes existem para cada profissão (desenvolvedor, estudante, dentista, jornalista)
        if (dadosPaciente[2].lowercase() == "desenvolvedor") {
            desenvolvedores++;
        } else if (dadosPaciente[2].lowercase() == "estudante") {
            estudantes++;
        } else if (dadosPaciente[2].lowercase() == "dentista") {
            dentistas++;
        } else if (dadosPaciente[2].lowercase() == "jornalista") {
            jornalistas++;
        }

        //! 3 - Apresente a quantidade de pacientes que moram em SP
        if (dadosPaciente[3].uppercase() == "SP") {
            nomePaulistas.add(dadosPaciente[0]);
        }

    }

    // Prints
    println("Pessoas com mais de 20 anos:")
    for (paciente in paciente20Anos){
        println("Nome: ${paciente[0]}, Idade: ${paciente[1]}")
    }
    println()

    println("---------------------------")
    println("Quantidades de pacientes:")
    println("Desenvolvedores: $desenvolvedores")
    println("Estudantes: $estudantes")
    println("Dentistas: $dentistas");
    println("Jornalistas: $jornalistas")


    println("---------------------------");
    println("Moram ${nomePaulistas.size} pacientes em São Paulo.");
    for (paulistas in nomePaulistas) {
        println("Nome: $paulistas")
    }


}