fun main() {
    println("Bem vindo ao Twink - A sua rede Social favorita")
    println()

    val contaAndre = Conta(login = "andre@gmail.com", senha = "Andre#3004", username = "AndreOAndre", seguidores = 0, seguindo = 0)
    println(contaAndre.login)
    println(contaAndre.senha)
    println(contaAndre.username)
    println(contaAndre.seguidores)
    println(contaAndre.seguindo)

    println()

    val contaAna = Conta("anaelson@gmail.com", "aninhadasilva123", username = "AnaEuSou", seguidores = 0, seguindo = 0)
    println(contaAna.login)
    println(contaAna.senha)
    println(contaAna.username)
    println(contaAna.seguidores)
    println(contaAna.seguindo)

    println(testaCondicao())
//------------------------------------------------//
}











