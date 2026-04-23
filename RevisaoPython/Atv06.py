import os 
os.system("clear||cls")

numeros = []
for i in range(1, 6):
    while True:
        try:
            numero = float(input(f"informe o {i} número: "))
            numeros.append(numero)
            break
        except ValueError:
            print("informe um número válido.")

maior = max(numeros)
menor = min(numeros)

print(f"o maior valor da lista é: {maior}")
print(f"o menor valor da lista é: {menor}")