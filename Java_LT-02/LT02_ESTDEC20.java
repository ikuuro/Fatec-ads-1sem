/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FATEC ZONA LESTE
 */
import javax.swing.JOptionPane;

public class LT02_ESTDEC20 {
    public static void main(String [] args){
          double delta,a,b,c,x1,x2;
        
        a = Double.parseDouble(JOptionPane.showInputDialog("digite o valor de A: "));
        b = Double.parseDouble(JOptionPane.showInputDialog("digite o valor de B: "));
        c = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de C: "));
        
        
        delta = Math.pow(b,2) - 4*a*c;
        
        if (delta< 0){
            JOptionPane.showMessageDialog(null,"Nao possui raizes reais");
        }
        
        else{
            x1 = (-b + Math.pow(delta,0.5)) /(2*a);
            x2 = (-b - Math.pow(delta,0.5)) /(2*a);
            
            JOptionPane.showMessageDialog(null,"raiz 1: " + x1);
            JOptionPane.showMessageDialog(null,"raiz 2: " + x2);
            
        }
        
    }
}
