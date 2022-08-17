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
//------------------------------------------------//
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
    contaAndre.post("")
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


class Conta(
    val login: String,
    val senha: String,
    val username: String,
    var seguidores: Int,
    var seguindo: Int
) {
    fun verificaLogin(loginValor: String, senhaValor: String) {
        if (loginValor == login && senhaValor == senha) {
            println("Login realizado com sucesso!")
        } else {
            println("Seus dados estão incorretos.")
        }
    }

    fun post(valor: String) {
        if (valor == "") {
            println("digite algo para poder postar")
        } else {
            println(valor)
        }
    }

    fun seguir(pedido: Conta, destino: Conta) {
        if (pedido != destino) {
            destino.seguidores++
            pedido.seguindo++
            println(destino.seguidores)
            println(destino.seguindo)

        } else{
            println("você não pode seguir voce mesmo. procure por amigos novos em nossa rede :)")
        }
    }

    fun direct(mensagem: String, destino: Conta){
        if(mensagem == ""){
            println("Voce precisa escrever algo para enviar sua mensagem")
        }else{
            println(mensagem)
        }
    }
}











