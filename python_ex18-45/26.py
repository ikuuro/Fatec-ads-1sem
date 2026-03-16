a = int(input("Digite o primeiro número: "))
b = int(input("Digite o segundo número: "))

maior = max(a, b)
menor = min(a, b)

if maior % menor == 0:
    print("O maior é múltiplo do menor")
else:
    print("O maior NÃO é múltiplo do menor")