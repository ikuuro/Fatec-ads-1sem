import javax.swing.JOptionPane;


package lt01;


public class LT01_ESTSEQ10 {


    public static void main (String args[]) {

        double n1, n2, diferenca;

        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor"));

        diferenca = n1 - n2;

        
        JOptionPane.showMessageDialog(null, "A diferença dos valores é de " + diferenca);
    }
}
