package animais;

public class Cachorro extends Animal{
    
    private String correr;
    private String emitirSom;
    
    Cachorro(String nome, float idade, String emitirSom, String correr){
        super(nome, idade, emitirSom);

        this.correr = correr;
    }
    public String getemitirSom(){
        return emitirSom;
    }
    public void setemitirSom(){
        this.emitirSom = emitirSom;
    }
    public String getCorrer(){
        return this.correr;
    }
    public void setCorrer(){
        this.correr=correr;
    }
}