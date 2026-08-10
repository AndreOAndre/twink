# Twink - Rede Social em Kotlin
Projeto desenvolvido para praticar os conceitos de **Programação Orientada a Objetos (POO)** utilizando **Kotlin**.

A aplicação simula uma rede social chamada **Twink**, onde diferentes tipos de contas podem interagir por meio de funcionalidades como autenticação, criação de publicações, envio de mensagens diretas e sistema de seguidores.

---

## Sobre o projeto:
O objetivo deste projeto é aplicar os principais pilares da Programação Orientada a Objetos na construção de uma aplicação simples, porém organizada e escalável.

Ao invés de desenvolver funcionalidades isoladas, o projeto busca representar um cenário real de uma rede social, modelando contas de usuários, diferentes planos de assinatura e interações entre eles.

---

## Objetivos:
Este projeto foi desenvolvido para praticar:

- Programação Orientada a Objetos (POO)
- Classes abstratas
- Herança
- Interfaces
- Polimorfismo
- Encapsulamento
- Controle de acesso (`private`, `protected` e `public`)
- Organização do código em múltiplos arquivos
- Modelagem de domínio

---

## Funcionalidades:

###  Login:
As contas possuem autenticação simples baseada em:
- Login
- Senha
O sistema valida as credenciais antes de confirmar o acesso.


### Publicações:
Cada usuário pode realizar publicações na plataforma.

Também existe validação para impedir publicações vazias.


### Mensagens Diretas:
Usuários podem enviar mensagens privadas para outras contas.

O sistema valida se uma mensagem foi informada antes do envio.

### Sistema de seguidores:
A aplicação permite que uma conta siga outra.

Também impede que um usuário siga a si mesmo.


### Tipos de conta:
O projeto implementa dois modelos de conta:

### Conta Free:
- Pode seguir outros usuários.
- Atualiza a quantidade de contas seguidas.

### Conta Plus:
Além das funcionalidades da conta gratuita:
- Atualiza seguidores e seguindo durante a interação.
- Representa um comportamento diferente utilizando polimorfismo.

---

## Tecnologias utilizadas

- Kotlin
- IntelliJ IDEA

---

## Conceitos aplicados:
Durante o desenvolvimento foram utilizados diversos conceitos da orientação a objetos:

- Classes
- Objetos
- Classe abstrata
- Herança
- Interfaces
- Polimorfismo
- Encapsulamento
- Métodos
- Sobrescrita (`override`)
- Modificadores de acesso
- Organização em múltiplos arquivos

---

## Arquitetura

O projeto foi dividido em responsabilidades específicas para facilitar a manutenção e evolução da aplicação.

| Classe | Responsabilidade |
|---------|------------------|
| **Conta** | Classe abstrata responsável pelas funcionalidades comuns das contas. |
| **ContaFree** | Implementa uma conta gratuita. |
| **ContaPlus** | Implementa uma conta premium com comportamento diferenciado. |
| **Seguir** | Interface responsável pela funcionalidade de seguir usuários. |
| **Main** | Ponto de entrada da aplicação. |
| **testaCondicao** | Classe utilizada para validar e testar as funcionalidades da aplicação. |
| **testaSeguir** | Responsável pelos testes relacionados ao sistema de seguidores. |

---

## Fluxo da aplicação:

```text
Início
   │
   ▼
Criação das contas
   │
   ▼
Autenticação
   │
   ▼
Interações
   │
   ├── Publicar
   ├── Seguir usuários
   ├── Enviar Direct
   └── Validar operações
```

---

## Como executar:

1. Clone este repositório:

```bash
git clone https://github.com/SEU-USUARIO/twink.git
```

2. Abra o projeto no IntelliJ IDEA.

3. Execute o arquivo:

```text
Main.kt
```

4. Para visualizar todas as funcionalidades implementadas, execute também:

- `testaCondicao.kt`
- `testaSeguir.kt`

---

## Melhorias futuras:
O projeto foi desenvolvido como ambiente de estudos e pode evoluir para uma aplicação mais completa com funcionalidades como:

- Cadastro de usuários.
- Persistência em banco de dados.
- Feed de publicações.
- Curtidas.
- Comentários.
- Compartilhamentos.
- Sistema de notificações.
- Perfis personalizados.
- Pesquisa de usuários.
- Exclusão e edição de postagens.
- Interface gráfica utilizando Jetpack Compose.
- API REST utilizando Ktor ou Spring Boot.

---

## Aprendizados:
Este projeto permitiu aprofundar o entendimento dos conceitos de Programação Orientada a Objetos em Kotlin, principalmente na modelagem de classes, utilização de herança, interfaces e organização do código em responsabilidades específicas.

Além disso, serviu como base para compreender como aplicações maiores podem ser estruturadas a partir de pequenos componentes reutilizáveis.

---

## Autor

**André Luís**

Graduando em Ciência da Computação e estudante de Desenvolvimento de Software, utilizando este repositório para documentar a evolução dos estudos em Kotlin, Programação Orientada a Objetos e desenvolvimento de aplicações.
