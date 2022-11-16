package interfaces;

public class Quadrado implements AreaCalculavel {
        private double lado;
        
        Quadrado(double lado){
            this.lado = lado;
        }

        @Override
        public double calculaArea(){
            return this.lado*this.lado;
       }
       
}
