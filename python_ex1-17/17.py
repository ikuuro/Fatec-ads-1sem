tempo = float(input("Tempo de viagem (horas): "))
velocidade = float(input("Velocidade média (km/h): "))

distancia = tempo * velocidade
litros = distancia / 12

print("Distância percorrida:", distancia, "km")
print("Litros gastos:", litros)