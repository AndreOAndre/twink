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