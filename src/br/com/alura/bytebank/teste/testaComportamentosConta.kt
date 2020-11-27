package br.com.alura.bytebank.teste

import br.com.alura.bytebank.exception.FalhaAutenticacaoException
import br.com.alura.bytebank.exception.SaldoInsuficienteException
import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaComportamentosConta() {

    val alex = Cliente(nome = "alex", cpf = "", senha = 1)
    val contaAlex = ContaCorrente(titular = alex, numero = 1000)
    contaAlex.deposita(200.0)

    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)

    val fran = Cliente(nome = "fran", cpf = "", senha = 2)
    val contaFran = ContaPoupanca(numero = 1001, titular = fran)
    contaAlex.deposita(300.0)

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

    println("depositando na conta do Alex")
    contaAlex.deposita(50.0)
    println(contaAlex.saldo)

    println("depositando na conta da Fran")
    contaFran.deposita(70.0)
    println(contaFran.saldo)

    println("sacando na conta do Alex")
    contaAlex.saca(250.0)
    println(contaAlex.saldo)

    println("sacando na conta da Fran")
    contaFran.saca(100.0)
    println(contaFran.saldo)

    println("saque em excesso na conta do Alex")
    contaAlex.saca(100.0)
    println(contaAlex.saldo)

    println("saque em excesso na conta da Fran")
    contaFran.saca(500.0)
    println(contaFran.saldo)

    println("transferencia da conta da Fran para o Alex")

    try {
        contaFran.transfere(destino = contaAlex, valor = 70.0, senha = 1)
        println("transferencia feita com sucesso")
    } catch (e: SaldoInsuficienteException) {
        println("falha na transferencioa")
        println("saldo insuficiente")
        e.printStackTrace()
    }catch (e: FalhaAutenticacaoException){
        println("falha na transferencia")
        println("falha na autenticacao")
        e.printStackTrace()
    }

    testaCopiasEReferencias()
    testaLacos()
    testaCondicoes(100.0)
}
