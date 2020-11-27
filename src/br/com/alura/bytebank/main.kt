package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Endereco
import java.lang.IllegalStateException

fun main() {

    var enderecoNulo: Endereco? = Endereco(logradouro = "rua vergueiro", complemento = "predio")
    val enderecoNovo: String? = enderecoNulo?.logradouro

    enderecoNulo?.let {
        println(it.logradouro)
        val tamanhoComplemento: Int = it.complemento?.length
            ?: throw IllegalStateException("complemento deve existir")
        println(tamanhoComplemento)
    }

    enderecoNulo?.let { endereco: Endereco ->
        println(endereco.logradouro.length)
    }

    teste(1)
    teste("")
}

fun teste(valor: Any){
    val numero: Int? = valor as? Int
    println(numero)
}



