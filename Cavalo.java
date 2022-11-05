package animais;

public class Cavalo extends Animal{
   
    private String correr;
    private String emitirSom;
    
    Cavalo(String nome, float idade, String emitirSom, String correr){
        super(nome, idade, emitirSom);
        
        this.correr = correr;
    }
    
    public String getemitirSom(){
        return this.emitirSom;
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
    
