package exercicioarray01;

public class ExercicioArray01 {

    public static void main(String[] args) {
         int[] vetor = new int[10];
         int contador = 10;
         
            for (int i = 0; i < vetor.length; i++) {
                vetor[i] = contador; 
                contador--;
        }
            
            //imprimindo elemento no array
            for(int i = 0; i < vetor.length; i++) {
                System.out.println("Valor: " + vetor[i]);
                }   
          }
    }
