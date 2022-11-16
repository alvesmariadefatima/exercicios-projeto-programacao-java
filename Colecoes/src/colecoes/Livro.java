package colecoes;

public class Livro {
    private String nome;
    private String codigo;
    
    Livro(String nome, String codigo){
        this.nome = nome;
        this.codigo = codigo;
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(){
        this.nome = nome;
    }
    public String getCodigo(){
        return this.codigo;
    }
    public void setCodigo(){
        this.codigo = codigo;
    }
    public String toString(){
        return "Nome do Livro: " + this.nome + " Código: " + this.codigo;
    }
}
