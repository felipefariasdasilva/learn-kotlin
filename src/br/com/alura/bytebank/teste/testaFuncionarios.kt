package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Analista
import br.com.alura.bytebank.modelo.CalculadorBonificacao
import br.com.alura.bytebank.modelo.Diretor
import br.com.alura.bytebank.modelo.Gerente

fun testaFuncionarios() {

    val alex = Analista(
        nome = "Alex",
        cpf = "111.111.111-11",
        salario = 1000.0
    )

    println()
    println("nome: ${alex.nome}")
    println("cpf: ${alex.cpf}")
    println("salario: ${alex.salario}")
    println("bonificacao: ${alex.bonificacao}")

    val fran = Gerente(
        nome = "Fran",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 1234
    )

    println()
    println("nome: ${fran.nome}")
    println("cpf: ${fran.cpf}")
    println("salario: ${fran.salario}")
    println("bonificacao: ${fran.bonificacao}")

    if (fran.autentica(1234)) {
        println("autenticacao com sucesso")
    } else {
        println("falha na autenticacao")
    }

    val gui = Diretor(
        nome = "Gui",
        cpf = "333.333.333-33",
        salario = 3000.0,
        senha = 1111,
        plr = 100.0
    )

    println()
    println("nome: ${gui.nome}")
    println("cpf: ${gui.cpf}")
    println("salario: ${gui.salario}")
    println("plr: ${gui.plr}")
    println("bonificacao: ${gui.bonificacao}")

    if (gui.autentica(1111)) {
        println("autenticacao com sucesso")
    } else {
        println("falha na autenticacao")
    }

    val maria = Analista(
        nome = "Maria",
        cpf = "444.444.444-44",
        salario = 1500.0
    )

    println()
    println("nome: ${maria.nome}")
    println("cpf: ${maria.cpf}")
    println("salario: ${maria.salario}")

    val calculadorBonificacao = CalculadorBonificacao()
    calculadorBonificacao.registra(alex)
    calculadorBonificacao.registra(fran)
    calculadorBonificacao.registra(gui)
    calculadorBonificacao.registra(maria)

    println()
    println("total de bonificacao : ${calculadorBonificacao.total}")
}
