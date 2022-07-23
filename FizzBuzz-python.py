#
# Autor:
# Michel Silva
# data: 23/07/2022

# em python
# Dado um número n, para cada número interior i no intervalo de 1 a n, imprime um valor por linha da seguinte maneira:
#
# Se i for múltiplo de 3 e 5, imprima o FizzBuzz.
# Se i for múltiplo de 3 (mas não de 5), imprima o Fizz.
# Se i for múltiplo de 5 (mas não de 3), imprima o Buzz.
# Se i não for múltiplo de 3 ou 5, imprima o valor de i.

# função principal
def fizzbuzz(n):  # n é o número de vezes que o programa deve rodar o loop de 1 a n
    for i in range(1, n+1): # loop de 1 a n
        if i % 3 == 0 and i % 5 == 0: # se i for múltiplo de 3 e 5
            print("FizzBuzz") # imprime FizzBuzz
        elif i % 3 == 0: # se i for múltiplo de 3
            print("Fizz") # imprime Fizz
        elif i % 5 == 0: # se i for múltiplo de 5
            print("Buzz") # imprime Buzz
        else: # se não for múltiplo de 3 ou 5
            print(i) # imprime o valor de i


# chamada da função principal
valor = int(input("Digite um valor: ")) # valor é o número de vezes que o programa deve rodar o loop de 1 a valor
fizzbuzz(valor) # chamada da função fizzbuzz com o valor de valor
print("Fim do programa")
