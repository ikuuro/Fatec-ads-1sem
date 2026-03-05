import math

a = float(input("Digite A: "))
b = float(input("Digite B: "))
c = float(input("Digite C: "))

delta = b**2 - 4ac

x1 = (-b + math.sqrt(delta)) / (2a)
x2 = (-b - math.sqrt(delta)) / (2a)

print("Raiz 1:", x1)
print("Raiz 2:", x2)