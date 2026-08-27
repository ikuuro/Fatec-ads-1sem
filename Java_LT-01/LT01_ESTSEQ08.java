import javax.swing.JOptionPane;


package lt01;


public class LT01_ESTSEQ08 {


    public static void main (String args[]){

        double deposito, investimento;
        
        deposito = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de depósito"));
        investimento = (double) (deposito * 1.013 * 1);

        
        JOptionPane.showMessageDialog(null, "Após 1 mês de aplicação: R$" + investimento);
    }
}
