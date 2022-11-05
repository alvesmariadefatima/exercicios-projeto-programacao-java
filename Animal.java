package animais;

public class Animal {
    private String nome;
    private float idade;
    private String emitirSom;
    
    Animal(String nome, float idade, String emitirSom){
        this.nome = nome;
        this.idade = idade;
        this.emitirSom = emitirSom;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(){
        this.nome = nome;
    }
    public float setIdade(){
        return this.idade;
    }
    public float getIdade(){
        return this.idade;
    }
    public String getemitirSom(){
        return this.emitirSom;
    }
    public void setemitirSom(){
        this.emitirSom = emitirSom;
    }
}

