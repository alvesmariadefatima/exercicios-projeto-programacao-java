/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garagem;

/**
 *
 * @author 1212515703
 */
public class Carro {
      private String marca;
      private String cor;
      private String placa;
      
     public Carro(String marca, String cor, String placa) {
          this.marca = marca;
          this.cor = cor;
          this.placa = placa;
          
          
    }
    public void setMarca(String marca){
    this.marca = marca;
}
    public String getMarca(){
    return this.marca;
}
    public void setCor(String cor){
        this.cor = cor;
    }
    public String getCor(String cor) {
        return this.cor;
    }
    public void setPlaca(String placa){
        this.placa = placa;
    }
    public String getPlaca(){
       return this.placa; 
    }
}