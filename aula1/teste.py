# Aula 1 - projeto supermercado
import os
os.system("clear || clr")

sabonete = 5.50
feijao = 7.00
skol = 4.50
acucar = 6.40
arroz = 5.60

QTsabonete = int(input("Informe a quantidade de sabonetes escolhidos: "))
QTfeijao = int(input("Informe a quantidade de kg de feijão escolhidos: "))
QTacucar = int(input("Informe a quantidade de kg de açucares escolhidos: "))
QTskol = int(input("Informe a quantidade de latas skol escolhidos: "))
QTarroz = int(input("Informe a quantidade de kg de arroz escolhidos: "))

soma = (sabonete*QTsabonete) + (feijao*QTfeijao) + (acucar*QTacucar) + (skol*QTskol) + (arroz*QTarroz)
total = (f'O valor total da sua compra é igual a R$ {soma:.2f}.')
print(total)