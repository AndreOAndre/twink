abstract class Conta(
    protected val login: String,
    protected val senha: String,
    val username: String,
    var seguindo: Int,
    var seguidores: Int,
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



    fun direct(mensagem: String, destino: Conta) {
        if (mensagem == "") {
            println("Voce precisa escrever algo para enviar sua mensagem")
        } else {
            println(mensagem)
        }
    }
}