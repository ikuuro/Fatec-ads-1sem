import javax.swing.JOptionPane;


package lt01;


public class LT01_ESTSEQ05 {


    public static void main (String args[]) {

        int a, b, c;
        double x1, x2, delta;

        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o coeficiente A"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o coeficiente B"));
        c = Integer.parseInt(JOptionPane.showInputDialog("Digite o coeficiente C"));


        delta = (double) (Math.pow(b, 2) - (4 * a * c));
        x1 = (double) (-b + Math.sqrt(delta)) / (2 * a);
        x2 = (double) (-b - Math.sqrt(delta)) / (2 * a);

        
        System.out.println("X1 = " + x1 + "\nX2 = " + x2);
    }
}
