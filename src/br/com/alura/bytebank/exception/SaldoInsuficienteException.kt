package br.com.alura.bytebank.exception

import java.lang.Exception

class SaldoInsuficienteException(
    mensagem: String = "o saldo eh insuficiente"): Exception(mensagem)