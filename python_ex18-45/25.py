hi = int(input("Hora início: "))
mi = int(input("Minuto início: "))

hf = int(input("Hora final: "))
mf = int(input("Minuto final: "))

inicio = hi * 60 + mi
fim = hf * 60 + mf

if fim < inicio:
    fim += 24 * 60

duracao = fim - inicio

horas = duracao // 60
minutos = duracao % 60

print("Duração:", horas, "horas e", minutos, "minutos")