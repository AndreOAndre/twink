fun testaCondicao(){

    val contaAndre = ContaFree(
        login = "andre@gmail.com",
        senha = "Andre#3004",
        username = "AndreOAndre",
        seguindo = 0,
        seguidores = 0

    )
    println(contaAndre.username)
    println(contaAndre.seguidores)
    println(contaAndre.seguindo)

    println()

    val contaAna = ContaPlus(
        login = "anaeusou@gmail.com",
        senha ="12345",
        username = "anaeuso",
        seguindo = 0,
        seguidores = 0
    )
    println(contaAna.username)
    println(contaAna.seguidores)
    println(contaAna.seguindo)




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
    contaAndre.seguir(pedido = contaAndre, destino = contaAna)
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