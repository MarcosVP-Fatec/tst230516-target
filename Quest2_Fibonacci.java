import java.util.Scanner;

/**
 * Verificar se um número passado é da sequência de Fibonacci.
 * @author Marcos Vinicio Pereira
 */

public class Quest2_Fibonacci {

    public static boolean isFibonacciContent(int numero){

        if (numero == 0) return true;
        if (numero < 0) return false;

        int pre = 0;
        int current = 1;
        int aux = 0;

        while (numero > current) {
            aux = current;
            current += pre;
            pre = aux;
        }

        if (numero == current) return true;
    
        return false;
    }

    private static void msgDigiteNumeroValido(){
        System.out.println(">>> Digite um número válido!");
    }

    // Teste da função
    public static void main(String[] args) {

        int numero;

        String digitado;

        while (true){

            //Scanner scan;
            try {
                System.out.print("Número para verificar: ");
                Scanner scan = new Scanner(System.in);
                digitado = scan.nextLine();
                if (digitado.equals("")){
                    scan.close();
                    break;
                }

                numero = Integer.parseInt(digitado);
                if (numero < 0){
                    msgDigiteNumeroValido();
                    continue;
                }
                System.out.print(String.format("O número \"%d\" %spertence à sequência de Fibonacci.\n"
                                ,numero
                                ,isFibonacciContent(numero)?"":"NÃO "));
                                
            } catch (Exception e) {
                msgDigiteNumeroValido();
            }

        }

        System.out.println("* * Final da execução * *");
    }

}
