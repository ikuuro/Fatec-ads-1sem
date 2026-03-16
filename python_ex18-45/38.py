maior = 0
menor = None

for i in range(100):
    num = float(input("Digite um número positivo: "))

    if menor is None or num < menor:
        menor = num

    if num > maior:
        maior = num

print("Maior:", maior)
print("Menor:", menor)