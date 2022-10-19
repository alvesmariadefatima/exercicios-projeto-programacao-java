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
    private float saldo;
    private double numero;
    
    public ContaBancaria(float saldo, double numero) {
        this.saldo = saldo;
        this.numero = numero;
    }
    
    void sacar(float valor){
        if(this.saldo < valor) {
            System.out.println("Saldo insuficiente!!!");
        }else{
            this.saldo -= valor;
            System.out.println("Seu novo saldo é: " + this.saldo);
        }
    }
    void depositar(float valor){
        this.saldo += valor;
        System.out.println("Seu novo saldo é: " + this.saldo);
    }
    void extrato(){
        System.out.println("Seu saldo é: " + this.saldo);
    }
    
    public float getSaldo(){
        return this.saldo;
    }
    
    public void setSaldo(float Saldo){
        this.saldo = saldo;
    }   
    
    public double getNumero(){
        return this.numero;
    }
    
    public void setNumero(int numero){
        this.numero = numero;
    }
}
