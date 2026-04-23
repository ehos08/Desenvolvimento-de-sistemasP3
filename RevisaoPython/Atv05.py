import os 
os.system("clear||cls")

for i in range(1,9):
    while True:
        try:
            numeros = []
            numero = float(input(f"Informe o {i} número: "))
            numeros.append(numero)
            break
        except ValueError:
            print("informe um número válido.")
        
        for numero in numeros:
            if numero > 0:
                numeroPositivo =+ 1
removidos = len(numeros) - numeroPositivo

print(f"Lista original: {numeros}")
print(f"Números positivos: {numeroPositivo}")
print(f"Números removidos: {removidos}")
