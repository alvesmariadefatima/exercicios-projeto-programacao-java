package polimorfismo;

public class Funcionario {
     private String nome;
     private String matricula;
     private float salario;
     
     Funcionario(){}
     Funcionario(String nome, String matricula){
         this.nome = nome;
         this.matricula = matricula;
     }
     
     Funcionario(String nome, String matricula, float salario){
         this.nome = nome;
         this.matricula = matricula;
         this.salario = salario;
     }
     public void calcularSalario(){
         System.out.println(this.salario);
     }
     public float getSalario(){
         return this.salario;
     }
     public void setSalario(float valor){
         this.salario = valor;
     }
}
