package programamedidalados;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ProgramaMedidaLados extends JFrame {
        private JTextField lado1;
        private JTextField lado2;
        private JTextField lado3;
        private JLabel campoLado1;
        private JLabel campoLado2;
        private JLabel campoLado3;
        private JButton verificarLado;
        
        public ProgramaMedidaLados(){
            this.setTitle("Jogo - Verificar Medida de Lados do Triângulo");
            this.setBounds(500, 100, 292, 450);
            
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
                this.getContentPane().setLayout(null);
                
             //labels para o usuário visualizar no programa
             campoLado1 = new JLabel();
             campoLado1.setText("Lado 1: ");
             campoLado1.setBounds(0, 70, 40, 40);
             this.add(campoLado1);
             
             campoLado2 = new JLabel();
             campoLado2.setText("Lado 2:");
             campoLado2.setBounds(0, 100, 40, 40);
             this.add(campoLado2);
             
             campoLado3 = new JLabel();
             campoLado3.setText("Lado 2:");
             campoLado3.setBounds(0, 130, 40, 40);
             this.add(campoLado3);
             
             //campo de digitação
             lado1 = new JTextField();
             lado1.setText("");
             lado1.setBounds(70, 70, 80, 40);
             this.add(lado1);
           
             lado2 = new JTextField();
             lado2.setText("");
             lado2.setBounds(70, 100, 90, 30);
             this.add(lado2);
             
             lado3 = new JTextField();
             lado3.setText("");
             lado3.setBounds(70, 130, 80, 40);
             this.add(lado3);
             
             //botão de verificar lado
             verificarLado = new JButton();
             verificarLado.setText("Verificar Lado");
             verificarLado.setBounds(70, 160, 80, 50);
             this.add(verificarLado);
                     
            javax.swing.JFrame ProgramaMedidaLados;
           
            ProgramaMedidaLados = new javax.swing.JFrame();
           
            ProgramaMedidaLados.setSize(400, 200);
           
            ProgramaMedidaLados.setTitle("Jogo - Verificar Medida de Lados do Triângulo");
                     
        }
        
    public static void main(String[] args) {
           
           ProgramaMedidaLados janela = new ProgramaMedidaLados();
           janela.setVisible(true);
           
    }
    
}
