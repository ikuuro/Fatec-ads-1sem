.data
msg1: .asciiz "Comprimento: "
msg2: .asciiz "Largura: "
msg3: .asciiz "Altura: "
msg4: .asciiz "Volume: "

.text
.globl main
main:
    # leitura
    li $v0,4; 
    la $a0,msg1; 
    syscall
    li $v0,5;
    syscall; 
    move $t0,$v0

    li $v0,4; la $a0,msg2; syscall
    li $v0,5; syscall; move $t1,$v0

    li $v0,4; la $a0,msg3; syscall
    li $v0,5; syscall; move $t2,$v0

    # volume = c*l*h
    mul $t3,$t0,$t1
    mul $t3,$t3,$t2

    li $v0,4; la $a0,msg4; syscall
    li $v0,1; move $a0,$t3; syscall

    li $v0,10; syscall