package exercicio02while;

import java.util.Scanner;

public class Exercicio02While {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
            int numero = entrada.nextInt();
            int contador = 0;
            
            while(numero!=-1) {
                contador++;
                numero = entrada.nextInt();  
            }
            System.out.println(contador);
        }
}
