tipo = int(input("Tipo de investimento (1=poupança, 2=renda fixa): "))
valor = float(input("Valor do investimento: "))

if tipo == 1:
    valor_corrigido = valor * 1.03
    print("Valor após 30 dias:", valor_corrigido)

elif tipo == 2:
    valor_corrigido = valor * 1.05
    print("Valor após 30 dias:", valor_corrigido)

else:
    print("Tipo de investimento inválido")