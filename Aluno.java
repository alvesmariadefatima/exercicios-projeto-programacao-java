/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca;

/**
 *
 * @author 1212515703
 */
public class Aluno extends Pessoa{
     private String matricula;
     
     public Aluno(String matricula, String nome, String cpf){
         super(nome, cpf);
         this.matricula = matricula;
     }
     public String getMatricula(){
         return this.matricula;
     }
     public void setMatricula(){
         this.matricula = matricula;
     }
}
