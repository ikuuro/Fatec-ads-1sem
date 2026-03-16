a = float(input("Digite A: "))
b = float(input("Digite B: "))
c = float(input("Digite C: "))

delta = b**2 - 4*a*c

if delta < 0:
    print("Não existem raízes reais")
else:
    x1 = (-b + delta**0.5) / (2*a)
    x2 = (-b - delta**0.5) / (2*a)

    print("Raiz 1:", x1)
    print("Raiz 2:", x2)