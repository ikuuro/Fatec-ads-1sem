/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FATEC ZONA LESTE
 */
import javax.swing.JOptionPane;
public class LT02_ESTDEC19 {
    
    public static void main(String [] args){
        
        double v1,v2;
        
        
        v1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor 1: "));
        v2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor 2: "));
        
        if(v1>v2){
            JOptionPane.showMessageDialog(null,"O maior valor é: "+v1);
        }
        
        else{
            JOptionPane.showMessageDialog(null,"O maior valor é: " + v2);
        }
    }
    
}
