/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olamundo;

import java.util.Scanner;

/**
 *
 * @author 1212515703
 */
public class OlaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

            Scanner entrada = new Scanner(System.in);
            System.out.println("Digite seu nome: ");
            String nome = entrada.nextLine();
            System.out.println(nome);
            
            int idade = entrada.nextInt();
            System.out.println(idade);
    }
    
}
