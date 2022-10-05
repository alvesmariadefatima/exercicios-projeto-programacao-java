package pessoa;

public class Pessoa {
        String nome;
        int idade;
        float altura;
        
        
        Pessoa(String nome, int idade){
            this.nome = nome;
            this.idade = idade;
        }
        void falar(String frase){
            System.out.println(frase);
        }
        
        void andar(int distancia){
            System.out.println("Andou " + distancia);
        }
        
}
