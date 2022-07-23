/*
# Autor:
# Michel Silva
# data: 23/07/2022 */

/* em Kotlin
# Dado um número n, para cada número interior i no intervalo de 1 a n, imprime um valor por linha da seguinte maneira:
#
# Se i for múltiplo de 3 e 5, imprima o FizzBuzz.
# Se i for múltiplo de 3 (mas não de 5), imprima o Fizz.
# Se i for múltiplo de 5 (mas não de 3), imprima o Buzz.
# Se i não for múltiplo de 3 ou 5, imprima o valor de i.  */

// função fizzBuzz
fun fizzBuzz(n: Int) { // função fizzBuzz com parametro n (inteiro)
    for (i in 1..n) { // for com i no intervalo de 1 a n (inteiro)
        if (i % 3 == 0 && i % 5 == 0) { // se i for multiplo de 3 e 5 (inteiro)
            println("FizzBuzz") // imprime FizzBuzz (string)
        } else if (i % 3 == 0) { // se i for multiplo de 3 (inteiro)
            println("Fizz") // imprime Fizz (string)
        } else if (i % 5 == 0) { // se i for multiplo de 5 (inteiro)
            println("Buzz") // imprime Buzz (string)
        } else { // se i não for multiplo de 3 ou 5 (inteiro)
            println(i) // imprime i (inteiro)
        }
    }
}

// função main
fun main() { // função main sem parametro (void)
    fizzBuzz(15) // chama função fizzBuzz com parametro n (inteiro)
}