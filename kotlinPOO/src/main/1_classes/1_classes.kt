fun main() {
    // Criei o objeto p1 da classe pessoa
    var p1 = Pessoa()
    // ja que nome é um atributo privado setei ele pelo método setter
    p1.setName("Rick")
    // Defini um sobrenome e a idade, como os atributos não são privados, ja alterei sem método setter
    p1.lastName = "Fernandes"
    p1.age = 24
    // chamei o método da classe
    p1.saudacao()


    // Usando o singleton
    Singleton.pessoa = p1

    Singleton.saudation()


}