package construtoresjava;

public class ConstrutoresJava {
       private String nome;
       private String cpf;
       private float idade;
       private String endereco;
               
    public ConstrutoresJava (String nome, String cpf, int idade, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.endereco = endereco;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(){
        this.nome = nome;
    }
    public String getCpf(){
        return this.cpf;
    }
    public void setCpf(){
        this.cpf = cpf;
    }
    public float getIdade(){
        return this.idade;
    } 
    public void setIdade(){
      this.idade = idade;
    } 
    public String getEndereco(){
        return this.endereco;
    }
    public void setEndereco(){
        this.endereco = endereco;
    }
}
    
    
