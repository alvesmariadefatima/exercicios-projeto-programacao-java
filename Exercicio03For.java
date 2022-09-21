package exercicio03for;

import java.util.Scanner;

public class Exercicio03For {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int mediaFinal = 0;
        int soma = 0;
            for(int i = 0; i < 10; i++) {
                int numero = entrada.nextInt();
                soma = soma+numero;
             }
            mediaFinal = soma/10;
            System.out.println(mediaFinal);
            System.out.println("Média: " + mediaFinal);
        }
     }
