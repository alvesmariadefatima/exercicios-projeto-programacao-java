package polimorfismo;

public class Main {
    public static void main(String[] args){
        Gerente gerente1 = new Gerente("Yana", "12345");
        gerente1.setComissao(50.0f);
        gerente1.setSalario(1200.0f);
        gerente1.calcularSalario();
        
        Vendedor vendedor1 = new Vendedor("Maria", "7845");
        vendedor1.setSalario(1000.0f);
        vendedor1.setVendas(5);
        vendedor1.calcularSalario();
    }
}
