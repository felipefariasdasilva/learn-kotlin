package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca
import br.com.alura.bytebank.modelo.Endereco

fun testaContasDiferentes() {

    val endereco = Endereco(
        logradouro = "rua vergueiro"
    )

    val alex = Cliente(cpf = "", endereco = endereco, senha = 1, nome = "alex")
    val contaCorrente = ContaCorrente(
        titular = alex,
        numero = 1000
    )

    val fran = Cliente(nome = "fran", cpf = "", senha = 2)
    val contaPoupanca = ContaPoupanca(
        titular = fran,
        numero = 1001
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println()
    println("saldo apos saque da corrente: ${contaCorrente.saldo}")
    println("saldo apos saque da poupanca: ${contaPoupanca.saldo}")

    println()
    contaCorrente.transfere(100.0, contaPoupanca, senha = 1)
    println("saldo corrente apos trasnferir para poupanca : ${contaCorrente.saldo}")
    println("saldo poupanca apos receber transferencia da corrente: ${contaPoupanca.saldo}")

    println()
    contaPoupanca.transfere(100.0, contaCorrente, senha = 2)
    println("saldo poupanca apos trasnferir para corrente: ${contaPoupanca.saldo}")
    println("saldo corrente apos receber transferencia da poupanca : ${contaCorrente.saldo}")
}
