/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FATEC ZONA LESTE
 */
import javax.swing.JOptionPane;

public class LT02_ESTDEC18 {
    
    public static void main(String [] args){
        
        int a,b,diferenca;
        
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero A: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero B:"));
        
        
        
        if (a > b){
            diferenca = a - b;
            JOptionPane.showMessageDialog(null,"A diferença entre os numeros é: "+ diferenca);
        }
        else{
            diferenca = b - a;
            JOptionPane.showMessageDialog(null,"A diferença dos numeros é: "+ diferenca);
        }
        
    }
    }
    

