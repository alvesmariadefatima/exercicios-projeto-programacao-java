/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contabancaria;

/**
 *
 * @author 1212515703
 */
public class Main {
     public static void main(String args[]){
         ContaBancaria c1 = new ContaBancaria(100, "123");
         c1.sacar(600);
         c1.depositar(200);
         c1.extrato();
     }
}
