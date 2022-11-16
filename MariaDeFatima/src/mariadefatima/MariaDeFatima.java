/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mariadefatima;

import java.util.Scanner;

/**
 *
 * @author 1212515703
 */
public class MariaDeFatima {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            Scanner nomeDoUsuario = new Scanner(System.in);
            System.out.println("Digite seu nome completo: ");
            String nome = nomeDoUsuario.nextLine();
            System.out.println("Olá, " + nome);
    }
    
}
