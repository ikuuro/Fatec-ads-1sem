voltas = int(input("Número de voltas: "))
extensao = float(input("Extensão do circuito (m): "))
tempo = float(input("Tempo (min): "))

distancia_m = voltas * extensao
distancia_km = distancia_m / 1000
tempo_h = tempo / 60

velocidade = distancia_km / tempo_h

print("Velocidade média:", velocidade, "km/h")