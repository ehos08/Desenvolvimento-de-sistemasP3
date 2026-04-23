import os
os.system("clear||cls")

for i in range(1,7):
    numeros = []
    numero = int(input("Informe um número inteiro: "))
    numeros.append(numero)

pares = 0
impares = 0
for numero in numeros:
    if numero % 2 == 0:
        pares += 1
    else:
        impares += 1
print(f"Números pares: {pares}")
print(f"Números ímpares: {impares}")
print(f"Total de números informados: {len(numeros)}")