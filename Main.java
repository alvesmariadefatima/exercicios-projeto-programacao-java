package pessoa;

public class Main {
    
    public static void main(String[] args){
        Pessoa pessoa1 = new Pessoa("Maria", 21);
        Pessoa pessoa2 = new Pessoa("Marcela", 25);
        
        pessoa1.falar("Olá Maria!!!");
        pessoa2.andar(5);
        
    }
}
