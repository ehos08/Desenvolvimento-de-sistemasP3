import os 
os.system("clear||clr")


soma = 0

nome = input("Informe o seu nome: ")
nota1 = float(input("Digite a sua 1° nota: "))
nota2 = float(input("Digite a sua 2° nota: "))
nota3 = float(input("Digite a sua 3° nota: "))

soma = nota1 + nota2 + nota3
media = soma/3    
print(f"SR(a) {nome}, sua média foi igual a {media}.")