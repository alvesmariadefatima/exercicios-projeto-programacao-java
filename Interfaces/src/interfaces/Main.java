package interfaces;

public class Main {
    public static void main(String[] args){
        Quadrado quadrado = new Quadrado(3);
        Retangulo retangulo = new Retangulo(4, 7);
        Circulo circulo = new Circulo(7);
        
        System.out.println("Quadrado: " + quadrado.calculaArea());
        System.out.println("Retangulo: " + retangulo.calculaArea());
        System.out.println("Circulo: " + circulo.calculaArea());
    }
}
