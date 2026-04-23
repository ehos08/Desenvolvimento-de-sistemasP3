import os
os.system("clear||cls")

notas = []
for i in range(1, 6):
    nota = float(input("Informe a nota do aluno (entre 0 e 10): "))
    if nota <0 or nota >10:
        print("nota inválida, informe uma nota válida.")
    else:
        notas.append(nota)

if len(notas) > 0: 
    media = sum(notas) / len(notas)
    notaAcimaMedia = [nota for nota in notas if nota > media]
    notaAbaixoMedia = [nota for nota in notas if nota < media]
    print(f"A média das notas é: {media:.2f}")
    print(f"Notas acima da média: {notaAcimaMedia}")
    print(f"Notas abaixo da média: {notaAbaixoMedia}")