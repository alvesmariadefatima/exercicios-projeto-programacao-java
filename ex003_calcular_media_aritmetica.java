public class CalculadoraMediaFinal {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        int numero1 = entrada.nextInt();
        
        System.out.println("Digite a segunda nota: ");
        int numero2 = entrada.nextInt();
        
        System.out.println("Digite a terceira nota: ");
        int numero3 = entrada.nextInt();
        
        float mediaFinal = (numero1 + numero2 + numero3)/3;
        
        if (mediaFinal >= 7) {
            System.out.println("Aprovado (a)");
            
        }
            else { 
        
            System.out.println("Reprovado");
                    
            }
        }
    }
    
