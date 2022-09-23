fun testaSeguir(){
    val contaAndre = ContaFree(
        login = "andre@gmail.com",
        senha = "Andre#3004",
        username = "AndreOAndre",
        seguindo = 0,
        seguidores = 0

    )
    println("Username: ${contaAndre.username}")
    println("Seguidores: ${contaAndre.seguidores}")
    println("Seguindo: ${contaAndre.seguindo}")

    println()

    val contaAna = ContaPlus(
        login = "anaeusou@gmail.com",
        senha = "12345",
        username = "anaeuso",
        seguindo = 0,
        seguidores = 0
    )

    println("Username ana: ${contaAna.username}")
    println("Seguidores ana: ${contaAna.seguidores}")
    println("Seguindo ana: ${contaAna.seguindo}")

    println()


    println("ana segue andre")
    contaAna.seguir(pedido = contaAna, destino = contaAndre)

    println("Seguidores ana: ${contaAna.seguidores}")
    println("Seguindo ana: ${contaAna.seguindo}")

    println()

    println("andre segue ana")
    contaAndre.seguir(pedido = contaAndre, destino = contaAna)

    println("Seguidores andre: ${contaAndre.seguidores}")
    println("Seguindo andre: ${contaAndre.seguindo}")

}