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
public class ContaBancaria {
    float saldo;
    String numero;
    
    public ContaBancaria(float saldo, String numero) {
        this.saldo = saldo;
        this.numero = numero;
    }
    
    void sacar(float valor){
        if(this.saldo < valor) {
            System.out.println("Saldo insuficiente!!!");
        }else{
            this.saldo -= valor;
            System.out.println("Seu novo saldo é? " + this.saldo);
        }
    }
    void depositar(float valor){
        this.saldo += valor;
        System.out.println("Seu novo saldo é: " + this.saldo);
    }
    void extrato(){
        System.out.println("Seu saldo é: " + this.saldo);
    }
}
