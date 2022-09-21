package exercicio03for;

import java.util.Scanner;

public class Exercicio03For {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a quantidade: ");
        int quantidade = entrada.nextInt();
        int mediaFinal = 0;
        int soma = 0;
            for(int i = 0; i < quantidade; i++) {
                System.out.println("Digite os números: ");
                int numero = entrada.nextInt();
                soma = soma+numero;
             }
            mediaFinal = soma/quantidade;
            System.out.println(mediaFinal);
            System.out.println("Media: " + mediaFinal);
        }
     }
