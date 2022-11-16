package polimorfismo;

public class Vendedor extends Funcionario{
    private int quantidadeVendas;
    
    Vendedor(String nome, String matricula){
        super(nome, matricula);
        this.quantidadeVendas = 0;
    }
    
    public void setVendas(int quantidade){
        this.quantidadeVendas = quantidade;
    }
    public int getVendas(){
        return this.quantidadeVendas;
    }
    
    public void calcularSalario(){
        System.out.println(getSalario() + (getVendas()*5));
    }
}
