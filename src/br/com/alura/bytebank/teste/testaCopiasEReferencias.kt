package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaCopiasEReferencias(){

    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numerX $numeroX")
    println("numerY $numeroY")

    val joao = Cliente(nome = "joao", cpf = "", senha = 1)
    val contaJoao = ContaCorrente(joao, 1002)
    contaJoao.titular.nome = "João"

    val maria = Cliente(nome = "maria", cpf = "", senha = 2)
    val contaMaria = ContaPoupanca(maria, 1003)
    contaMaria.titular.nome = "Maria"


}