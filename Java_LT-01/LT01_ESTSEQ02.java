import javax.swing.JOptionPane;


package lt_01;


public class LT01_ESTSEQ02 {


    public static void main (String args[]) {

        double salario_atual, salario_novo;

        salario_atual = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário atual"));
        salario_novo = (double) (salario_atual * 1.15);

        
        JOptionPane.showMessageDialog(null,"O salário novo após o reajuste será de R$" + salario_novo);
    }
}
