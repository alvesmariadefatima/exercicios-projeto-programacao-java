import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class VerificarLadoTriangulo {
    private JTextField lado1;
    private JTextField lado2;
    private JTextField lado3;

    public static void main(String[] args) {
        float lado1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro lado do triângulo: "));
        float lado2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo lado do triângulo: "));
        float lado3 = Float.parseFloat(JOptionPane.showInputDialog("Digite o terceiro lado do triângulo: "));     

        if(lado1 == lado3 && lado1 == lado3){
            JOptionPane.showMessageDialog(null, "Triângulo Equilátero", JOptionPane.WARNING_MESSAGE);
        } else if (lado1 == lado2 || lado1 == lado3) {
            JOptionPane.showMessageDialog(null, "Triângulo Isósceles", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Triângulo Escaleno", JOptionPane.WARNING_MESSAGE);
        }

        }
        
    }

