.data 
msg1: .asciiz "Digite o valor de n (maior que 0):"
msg2: .asciiz "\nValor de H = "

.text
.globl main

main:

#Leitura e validacao do n

ler_n:

#imprime mensagem

li $v0, 4
la $a0, msg1
syscall

#ler inteiro

li $v0, 5
syscall

#guardar n no t0

move $t0, $v0

