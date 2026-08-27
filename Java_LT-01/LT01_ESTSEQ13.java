import javax.swing.JOptionPane;


package lt01;


public class LT01_ESTSEQ13 {


    public static void main(String args[]) {

        double qtd_kg, dias;

        qtd_kg = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de alimento em kg"));
        dias = (qtd_kg * 1000) / 50;

        
        JOptionPane.showMessageDialog(null,"Esse alimento durará " + dias + " dia(s).");
    }
}
