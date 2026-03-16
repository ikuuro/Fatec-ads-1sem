a = int(input("Primeiro número: "))
b = int(input("Segundo número: "))

for num in range(a, b+1):
    primo = True

    if num < 2:
        primo = False

    for i in range(2, num):
        if num % i == 0:
            primo = False

    if primo:
        print(num)