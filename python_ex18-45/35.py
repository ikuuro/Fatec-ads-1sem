a = int(input("Digite o primeiro número: "))
b = int(input("Digite o segundo número: "))

maior = max(a,b)
menor = min(a,b)

soma = 0

for i in range(menor, maior + 1):
    if i % 2 != 0:
        soma += i

print("Somatória dos ímpares:", soma)