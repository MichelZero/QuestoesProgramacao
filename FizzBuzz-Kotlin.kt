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
fun fizzBuzz(n: Int) {
    for (i in 1..n) {
        if (i % 3 == 0 && i % 5 == 0) {
            println("FizzBuzz")
        } else if (i % 3 == 0) {
            println("Fizz")
        } else if (i % 5 == 0) {
            println("Buzz")
        } else {
            println(i)
        }
    }
}

// função main
fun main() {
    fizzBuzz(15)
}