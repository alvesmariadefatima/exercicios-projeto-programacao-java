package interfaces;

public class Circulo implements AreaCalculavel{
     private double raio;
     
     Circulo(double raio){
         this.raio = raio;
     }

    Circulo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     public double calculaArea(){
         double pi = 3.14;
         
         return this.raio*this.raio*pi;
     }
}
