package animais;

public class Preguica extends Animal{
    
    private String subirArvore;
    private String emitirSom;
    
    Preguica(String nome, float idade, String emitirSom, String subirArvore){
        super(nome, idade, emitirSom);
    }
    public String getemitirSom(){
        return this.emitirSom;
    }
    public void setemitirSom(){
        this.emitirSom = emitirSom;
}
    public String getsubirArvore(){
        return this.subirArvore;
    }
    public void setsubirArvore(){
        this.subirArvore = subirArvore;
    }
}
