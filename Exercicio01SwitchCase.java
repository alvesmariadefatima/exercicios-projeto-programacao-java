package exercicio01switchcase;

import java.util.Scanner;

public class Exercicio01SwitchCase {
    
    public static void main(String[] args) {  
            Scanner entrada = new Scanner(System.in);
            int numero = entrada.nextInt();
            
            switch (numero) { 
                case 0:
                    System.out.println("Bom domingo!!!");
                    break;
                    
                case 1:
                    System.out.println("Boa segunda!!!");
                    break;
                case 2:
                    System.out.println("Boa terça!!!");
                    break;
                default:
                    System.out.println("Entrada inválida!!!");
                    break;
           }
    }
}


    
