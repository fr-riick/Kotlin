fun main() {
    val dia = DiaDaSemana.SABADO

    when (dia) {
        DiaDaSemana.SABADO-> println("Fim de semana! Hoje é dia de ${dia.status}")
        DiaDaSemana.SEGUNDA -> println("Começando a semana... Hoje é dia de ${dia.status}")
        DiaDaSemana.QUARTA -> println("Metade da semana! Hoje é dia de ${dia.status}")
        else -> println("Dia comum")
    }
}

enum class DiaDaSemana(var status: String) {
    SEGUNDA("Peito"),
    TERCA("Triceps"),
    QUARTA("Perna"),
    QUINTA("Descanso"),
    SEXTA("Braço"),
    SABADO("Cachaça"),
    DOMINGO("Descanso")
}

