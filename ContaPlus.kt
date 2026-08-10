class ContaPlus(
    login: String,
    senha: String,
    username: String,
    seguindo: Int,
     seguidores: Int,
    
) : Conta(
    login,
    senha,
    username,
    seguindo,
    seguidores,
), Seguir{


    override fun seguir( pedido:Conta, destino: Conta) {
        if(pedido != destino){
            pedido.seguindo++
            pedido.seguidores++
        }else println("Você não pode seguir você mesmo!")
    }


}