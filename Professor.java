/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca;

public class Professor extends Pessoa{
     private float salario;
     
     public Professor(String nome, String cpf, float salario){
         super(nome, cpf);
         this.salario = salario;
     }
     
     public float getSalario(){
         return this.salario;
     }
     public void setSalario(float salario){
         this.salario = salario;
     }
}
