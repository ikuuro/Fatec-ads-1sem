import javax.swing.JOptionPane;


package lt_01;


public class LT01_ESTSEQ03 {


    public static void main (String args []) {

        double base, altura, area;

        base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do triângulo"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do triângulo"));
        area = (base * altura) / 2;

        
        JOptionPane.showMessageDialog(null,"A área do triângulo é igual a: " + area);
    }
}