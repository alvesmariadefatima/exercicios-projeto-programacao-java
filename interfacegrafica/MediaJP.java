package interfacegrafica;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MediaJP {
    public static void main(String[] args) {
        float num1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro número: "));
        float num2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo número: "));
        String opcaoEscolha = JOptionPane.showInputDialog("Escolha a operação que deseja calcular: 1 - Soma/ 2 - Subtração / 3 - Multiplicação / 4- Divisão ");
     
        float soma = num1 + num2;
        float subtracao = num1 - num2;
        float multiplicacao = num1 * num2;
        float divisao = num1 / num2;
        
        if(opcaoEscolha.equals("1")){
            JOptionPane.showMessageDialog(null, "Resultado final da soma: " + soma, "Resultado", JOptionPane.WARNING_MESSAGE);
        }
        if(opcaoEscolha.equals("2")) {
            JOptionPane.showMessageDialog(null, "Resultado final da subtração: " + subtracao, "Resultado", JOptionPane.WARNING_MESSAGE);
        }
        if(opcaoEscolha.equals("3")){
            JOptionPane.showMessageDialog(null, "Resultado final da multiplicação: " + multiplicacao, "Resultado", JOptionPane.WARNING_MESSAGE);
        }
        if(opcaoEscolha.equals("4")){
           JOptionPane.showMessageDialog(null, "Resultado final da divisão: " + divisao, "Resultado", JOptionPane.WARNING_MESSAGE);
        }
     }
 }

