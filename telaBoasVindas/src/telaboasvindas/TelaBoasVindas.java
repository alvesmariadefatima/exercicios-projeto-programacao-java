package telaboasvindas;

import java.util.Scanner;

public class TelaBoasVindas {
       String nomeUsuario;
       int idadeUsuario;
       int escolaridadeUsuario;
       int contatoUsuario;
       String enderecoUsuario;
       float rendaFamiliarUsuario;
       int confirmarMensagem;
       int confirmarDados;
       
    public static void main(String[] args) {
       Scanner leituraDados = new Scanner(System.in);
       System.out.println("Digite seu nome completo: ");
       String nomeUsuario = leituraDados.nextLine();
       
       System.out.println("Olá, " + nomeUsuario + ", seja bem-vindo(a) ao nosso sistema. Por favor, digite OK para dar prosseguimento ao seu cadastro.");
       String confirmarMensagem = leituraDados.nextLine();
       
       System.out.println("Digite sua idade: ");
       int idadeUsuario = leituraDados.nextInt();
       
       System.out.println("Qual o seu nível de escolaridade???");
       System.out.println("1 - Ensino Fundamental Incompleto");
       System.out.println("2 - Ensino Fundamental Completo");
       System.out.println("3 - Ensino Médio Incompleto");
       System.out.println("4 - Ensino Médio Completo");
       System.out.println("5 - Ensino Superior Incompleto");
       System.out.println("6 - Ensino Superior Completo");
       int escolaridadeUsuario = leituraDados.nextInt();
       
       System.out.println("Digite seu telefone para contato: ");
       System.out.println("Dica importante: Digite o DDD do seu estado + o número 9 + o número do seu telefone.");
       int contatoUsuario = leituraDados.nextInt();
       
       System.out.println("O número informado é WhatsApp???");
       System.out.println("1 - Sim");
       System.out.println("2 - Não");
       //int confirmarDados = leituraDados.nextInt();
       
       System.out.println("Digite seu endereço: ");
       String enderecoUsuario = leituraDados.nextLine();
       
       System.out.println("Por favor, informe sua renda mensal: R$ ");
       float rendaFamiliarUsuario = leituraDados.nextFloat();
       
       System.out.println("Deseja confirmar as informações???");
       System.out.println("=============================");
       System.out.println("Nome Completo: " + nomeUsuario);
       System.out.println("Idade atual: " + idadeUsuario);
       System.out.println("Grau de escolaridade: " + escolaridadeUsuario);
       System.out.println("Contato: " + contatoUsuario);
       System.out.println("Endereço: " + enderecoUsuario);
       System.out.println("Renda mensal: R$ " + rendaFamiliarUsuario);
    }
    
}
