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

#verifica se n <= 0

blez $t0, ler_n


#inicializadores


li $t1, 1    #contador i
li $t2, 0    #H

loop:

#se i > n ->fim
bgt $t1, $t0, fim




#par ou impar


#divide i por 2

li $t3, 2
div $t1, $t3

#pega o resto da divisao 
mfhi $t4



#se o resto for =0 ->par
beq $t4, $zero, par



#impar -> H=H + (1*i)



add $t2, $t2, $t1

j continua

par:


#par -> H=H - (2*i)


mul $t5, $t1 , 2

sub $t2, $t2, $t5

continua:

#contador i++
addi $t1, $t1, 1

j loop

fim:



#resultado


li $v0, 4
la $a0, msg2
syscall

li $v0,1
move $a0, $t2
syscall

#encerrar programa
li$v0,10
syscall

