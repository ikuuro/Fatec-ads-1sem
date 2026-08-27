import javax.swing.JOptionPane;


package lt01;


public class LT01_ESTSEQ04 {


    public static void main (String args[]) {

        double celsius, fahrenheit;

        celsius = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura em Celsius"));
        fahrenheit = (9 * celsius + 160) / 5;

        
        JOptionPane.showMessageDialog(null,"A temperatura em Fahrenheite é igual a: " + fahrenheit + "ºF");
    }
}
