import os 
os.system("clear||cls")
import time
while True:
    idade = int(input("Informe as idades para o cálculo da média (apenas números positivos): "))
    if idade <= 0:
        print("Encerrando o programa")
        time.sleep(0.5)
        os.system("clear||cls")
        print("Encerrando o programa.")
        time.sleep(1)
        os.system("clear||cls")
        print("Encerrando o programa..")
        time.sleep(1)
        os.system("clear||cls")
        print("Encerrando o programa...")
        time.sleep(1)
        os.system("clear||cls")
        break
    elif idade > 0:
        totalIdades = 0
        contador = 0
        contadorMaioridade = 0
        idades = []
        while idade > 0:
            totalIdades += idade
            contador += 1
            idades.append(idade)
            if idade >= 18:
                contadorMaioridade += 1
            idade = int(input("Informe as idades para o cálculo da média (apenas números positivos): "))
        if contador > 0:
            media = totalIdades / contador
            print(f"\nIdades cadastradas: {idades}")
            print(f"Total de idades cadastradas: {contador}")
            print(f"A média das idades é: {media:.2f}")
            print(f"Quantidade de pessoas maiores de idade: {contadorMaioridade}\n")
        else:
            print("Nenhuma idade válida informada.")
            print("Encerrando o programa")
            time.sleep(0.5)
            os.system("clear||cls")
            print("Encerrando o programa.")
            time.sleep(1)
            os.system("clear||cls")
            print("Encerrando o programa..")
            time.sleep(1)
            os.system("clear||cls")
            print("Encerrando o programa...")
            time.sleep(1)
            os.system("clear||cls")
            break