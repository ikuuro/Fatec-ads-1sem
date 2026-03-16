soma = 0
sinal = 1

for i in range(1, 16):
    termo = i / (i*i)

    if sinal == 1:
        soma += termo
    else:
        soma -= termo

    sinal *= -1

print("Resultado da série:", soma)