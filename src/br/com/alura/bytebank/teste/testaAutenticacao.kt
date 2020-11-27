package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.Diretor
import br.com.alura.bytebank.modelo.Gerente
import br.com.alura.bytebank.modelo.SistemaInterno

fun testaAutenticacao() {

    val gerente = Gerente(
        nome = "alex",
        cpf = "111.111.111-11",
        salario = 1000.0,
        senha = 1234
    )

    val diretor = Diretor(
        nome = "fran",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 5678,
        plr = 200.0
    )

    val cliente = Cliente(
        nome = "gui",
        cpf = "333.333.333-33",
        senha = 1111
    )

    val sistema = SistemaInterno()
    sistema.entra(gerente, 1234)
    sistema.entra(diretor, 5678)
    sistema.entra(cliente, 1111)

}
