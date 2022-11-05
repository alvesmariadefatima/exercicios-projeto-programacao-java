package animais;

public class Main {
    public static void main(String [] args){
        Cachorro cachorro = new Cachorro("Flor", 4, "Emite Som", "Corre");
        Cavalo cavalo = new Cavalo("Margarida", 6, "Emite Som", "Corre");
        Preguica preguica = new Preguica("Lêmore", 5, "Emite som", "Sobe Árvore");
        
        System.out.println(cachorro.getNome());
        System.out.println(cavalo.getNome());
        System.out.println(preguica.getNome());
        
        System.out.println(cachorro.getIdade());
        System.out.println(cavalo.getIdade());
        System.out.println(preguica.getIdade());
        
        System.out.println(cachorro.getemitirSom());
        System.out.println(cavalo.getemitirSom());
        System.out.println(preguica.getemitirSom());
        
        System.out.println(cachorro.getCorrer());
        System.out.println(cavalo.getCorrer());
        System.out.println(preguica.getsubirArvore());
    }    
}
