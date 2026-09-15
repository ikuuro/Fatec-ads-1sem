/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ikaro
 */

import javax.swing.JOptionPane;

public class LT02_ESTDEC22 {
    public static void main(String[]args){
        
        int v1,v2;
        
        
        v1 = Integer.parseInt(JOptionPane.showInputDialog("digite o valor 1: "));
        v2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor 2: "));
        
        if( v2 > v1 ){
            JOptionPane.showMessageDialog(null,"" +v1 + " " + v2);
        }
        else{
            JOptionPane.showMessageDialog(null,"" +v2 +" " + v1);
        }
            
    }
    
}
