import javax.swing.JOptionPane;
package lt01;
public class LT01_ESTSEQ11 {
    public static void main (String args[]) {
        double raio, comprimento, pi;
        pi = (double) 3.14;
        raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o raio da circunferência"));
        comprimento = (double) 2 * pi * raio;
        JOptionPane.showMessageDialog(null, "O comprimento da circunferência é igual a: " + comprimento);
    }
}
