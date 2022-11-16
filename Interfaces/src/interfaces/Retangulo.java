package interfaces;

public class Retangulo implements AreaCalculavel{
    private double base;
    private double altura;
    
    Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    public double calculaArea(){
        return this.base*this.altura;
    }
}
