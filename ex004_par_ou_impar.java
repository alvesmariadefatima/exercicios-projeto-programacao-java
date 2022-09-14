package parouimpar;

import java.util.Scanner;

public class ParOuImpar {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num1 = entrada.nextInt();
        
        if (num1%2 == 0) {
            System.out.println("O número é par.");
        }
        else 
            System.out.println("O número é ímpar.");
        }
    }
