import os
os.system("clear||cls")

numeros = []
for i in range(7):
    while True:
        try:
            numero = float(input(f"informe o número {i+1} para ser armazenado: "))
            numeros.append(numero)
            break
        except ValueError:
            print("Por favor, informe um número válido.")
while True:
    try:
        numeroBuscado = float(input("Informe um número para ser buscado: "))
        break
    except ValueError:
        print("Por favor, informe um número válido.")

if numeroBuscado in numeros:
    posicao = numeros.index(numeroBuscado)
    print(f"O número {numeroBuscado} foi encontrado na lista.")
    print(f"O número {numeroBuscado} está na posição {posicao} da lista.")
else:
    print(f"O número {numeroBuscado} não foi encontrado na lista.")