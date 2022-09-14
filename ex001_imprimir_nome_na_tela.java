package mariadefatima;

import java.util.Scanner;

public class MariaDeFatima {

    public static void main(String[] args) {
        
            Scanner nomeDoUsuario = new Scanner(System.in);
            System.out.println("Digite seu nome completo: ");
            String nome = nomeDoUsuario.nextLine();
            System.out.println("Olá, " + nome);
    }
    
}
