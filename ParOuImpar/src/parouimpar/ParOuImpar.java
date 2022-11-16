/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parouimpar;

import java.util.Scanner;

/**
 *
 * @author 1212515703
 */
public class ParOuImpar {

    /**
     * @param args the command line arguments
     */
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
   
