/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoramediafinal;

import java.util.Scanner;

/**
 *
 * @author 1212515703
 */
public class CalculadoraMediaFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        int numero1 = entrada.nextInt();
        
        System.out.println("Digite a segunda nota: ");
        int numero2 = entrada.nextInt();
        
        System.out.println("Digite a terceira nota: ");
        int numero3 = entrada.nextInt();
        
        float mediaFinal = (numero1 + numero2 + numero3)/3;
        
        if (mediaFinal >= 7) {
            System.out.println("Aprovado (a)");
            
        }
            else { 
        
            System.out.println("Reprovado");
                    
            }
        }
    }
    
