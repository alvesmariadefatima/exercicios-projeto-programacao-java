package exercicioarray02;

public class ExercicioArray02 {

    public static void main(String[] args) {
        int array [] = new int[5];
        array[0] = 10;
        array[1] = - 1;
        array[2] = 5;
        array[3] = 9;
        array[4] = -5;
        int contador = 0;
        
            for (int i = 0; i < array.length; i++) {
                if(array[i] < 0) {
                    contador++;
                }
            }
                System.out.println("Quantidade de números negativos: " + contador);
        }
    }  
