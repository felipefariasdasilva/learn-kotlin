package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Endereco

fun testaAny() {
    val endereco = Endereco(
        logradouro = "rua velha",
        bairro = "vergueiro",
        cep = "00000-000"
    )
    val enderecoNovo = Endereco(
        logradouro = "rua nova",
        estado = "sao paulo",
        cep = "00000-000"
    )

    println(endereco.equals(enderecoNovo)) //false

    println(endereco.hashCode())
    println(enderecoNovo.hashCode())

    println(endereco.toString())
    println(enderecoNovo.toString())

    println("${endereco.javaClass}@${Integer.toHexString(endereco.hashCode())}")
}