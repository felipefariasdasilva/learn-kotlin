package br.com.alura.bytebank.exception

import java.lang.Exception

class FalhaAutenticacaoException(
    mensagem: String = "falha na autenticacao"
) : Exception(mensagem)