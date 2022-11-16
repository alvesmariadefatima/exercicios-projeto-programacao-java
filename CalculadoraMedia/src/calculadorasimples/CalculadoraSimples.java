/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorasimples;

import java.util.Scanner;

/**
 *
 * @author 1212515703
 */
public class CalculadoraSimples{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int PrimeiroNumero = entrada.nextInt();
        
        System.out.println("Digite o segundo número: ");
        int SegundoNumero = entrada.nextInt();
                
        System.out.println(PrimeiroNumero + SegundoNumero);
    }
    
}
