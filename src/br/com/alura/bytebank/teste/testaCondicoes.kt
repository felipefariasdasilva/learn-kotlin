package br.com.alura.bytebank.teste

fun testaCondicoes(saldo: Double){

    if(saldo > 0.0){
        println("conta eh positiva")
    }else if(saldo == 0.0){
        println("conta eh neutra")
    }else{
        println("conta eh negativa")
    }

    when{
        saldo > 0.0 -> println("conta eh positiva")
        saldo == 0.0 -> println("conta eh neutra")
        else -> println("conta eh negativa")
    }

}