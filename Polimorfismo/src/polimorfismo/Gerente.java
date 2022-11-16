package polimorfismo;

public class Gerente extends Funcionario{
     private float comissao;
     
     Gerente(String nome, String matricula){
         super(nome, matricula);
         this.comissao = 0;
     }
     @Override
     public void calcularSalario(){
         System.out.println(getSalario() + this.comissao);
     }
     public float getComissao(){
         return comissao;
     }
     public void setComissao(float valor){
         this.comissao=valor;
     }
}
