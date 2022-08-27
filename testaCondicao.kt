fun testaCondicao(){

    val contaAndre = Conta(
        login = "andre@gmail.com",
        senha = "Andre#3004",
        username = "AndreOAndre",
        seguidores = 0,
        seguindo = 0
    )

    val contaAna = Conta(
        login = "anaelson@gmail.com",
        senha = "aninhadasilva123",
        username = "AnaEuSou",
        seguidores = 0,
        seguindo = 0
    )

    println("TESTANDO LOGIN")
    contaAndre.verificaLogin("andre@gmail.com", "Andre#3004")

    println()

    println("TESANDO LOGIN COM FALHA")
    contaAndre.verificaLogin("andregmail.com", "Andre#3004")
    contaAndre.verificaLogin("andre@gmail.com", "Andre3004")
//------------------------------------------------//
    println()
//------------------------------------------------//
    println("TESTANDO POST")
    contaAndre.post("ola Twink, meu primeiro post")

    println("TESTANDO ERRO NO POST")
    contaAndre.post(valor = "")
//------------------------------------------------//
    println()
//------------------------------------------------//
    println("TESTANDO SEGUIDORES")
    contaAndre.seguir(contaAndre, contaAna)
    println("seguidores ana: ${contaAna.seguidores}")
    println("seguidores andre: ${contaAndre.seguidores}")
    println("andre segue: ${contaAndre.seguindo}")
    println("ana segue: ${contaAna.seguindo}")

    contaAna.seguir(contaAna, contaAndre)
    println("seguidores ana: ${contaAna.seguidores}")
    println("seguidores andre: ${contaAndre.seguidores}")
    println("andre segue: ${contaAndre.seguindo}")
    println("ana segue: ${contaAna.seguindo}")

    println()

    println("TESTANDO ERRO SEGUIDORES")
    contaAndre.seguir(contaAndre, contaAndre)
    println("seguidores ana: ${contaAna.seguidores}")
    println("seguidores andre: ${contaAndre.seguidores}")
//------------------------------------------------//

    println("TESTANDO MENSAGEM DIRECT")
    contaAndre.direct("oi, e nova aqui?", contaAna)

    println("TESTANDO FALHA NA MENSAGEM")
    contaAndre.direct("", contaAna)
}