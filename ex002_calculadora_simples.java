package calculadorasimples;

import java.util.Scanner;

public class CalculadoraSimples{

    public static void main(String[] args) {

        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int PrimeiroNumero = entrada.nextInt();
        
        System.out.println("Digite o segundo número: ");
        int SegundoNumero = entrada.nextInt();
                
        System.out.println(PrimeiroNumero + SegundoNumero);
    }
    
}
