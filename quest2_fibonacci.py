#
# Verificar se um número passado é da sequência de Fibonacci.
# Marcos Vinicio Pereira
#


def Is_Fibonacci_Content(numero):
    if numero == 0:
        return True
    if numero < 0:
        return False
    
    pre = 0
    current = 1
    aux = 0
    while (numero > current):
        aux = int(current)
        current += pre
        pre = int(aux)

    if numero == current:
        
        return True
    
    return False


# Teste da função
while True:
    digitado = input("Número para verificar: ")
    try:    
        numero = int(digitado)    
        print("O número","\""+str(numero)+"\"",("" if Is_Fibonacci_Content(numero) else "NÃO ") + "pertence à sequência de Fibonacci")
        
    except ValueError as e:
        if digitado == '':
            break
        else:
            print(">>> Digite um número válido!")
    
print("\n* * Final da execução * *")
    

