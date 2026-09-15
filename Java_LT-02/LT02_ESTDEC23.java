/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ikaro
 */
import javax.swing.JOptionPane;

public class LT02_ESTDEC23 {
    public static void main(String[] args){
        int v1,v2,v3,v4;
        
        JOptionPane.showMessageDialog(null,"Digite os 3 primeiros valores em ordem crescente");
         
        v1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor 1: "));
        v2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor 2: "));
        v3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor 3: "));
        v4 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor 4: "));
        
        
        if (v1<v2 && v2<v3){
            
            if(v1>v4){
                JOptionPane.showMessageDialog(null,"" + v4+ " " + v1 + " " + v2 + " "+v3);
            }
            else if(v2>v4){
                JOptionPane.showMessageDialog(null,"" + v1 + " " + v4 + " " + v2 + " " + v3);
            }
            else if(v3>v4){
                JOptionPane.showMessageDialog(null,""+ v1 + " " + v2 + " " + v4 + " " + v3);
            }
            else{
                JOptionPane.showMessageDialog(null,"" + v1 + " " + v2 + " " + v3 + " " + v4);
                
            }
                
        }
        else{
            JOptionPane.showMessageDialog(null,"os valores nao estao em ordem crescente");
        }
    }}







                    
                
            
            
        
    
    

