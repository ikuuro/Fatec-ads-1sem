horas = float(input("Horas trabalhadas: "))
valor_hora = float(input("Valor por hora: "))
desconto_percent = float(input("Percentual de desconto (%): "))
dependentes = int(input("Número de dependentes: "))

salario_bruto = horas * valor_hora
desconto = salario_bruto * (desconto_percent / 100)

salario_liquido = salario_bruto - desconto
salario_liquido += dependentes * 100

print("Salário a receber:", salario_liquido)