/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FATEC ZONA LESTE
 */
import javax.swing.JOptionPane;

public class LT02_ESTDEC21 {
    public static void main(String[] args){
        double nota1,nota2,nota3,nota4,mediafinal;
        
        nota1 = Double.parseDouble(JOptionPane.showInputDialog("Insira a primeira nota: "));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog("Insira a segunda nota: "));
        nota3 = Double.parseDouble(JOptionPane.showInputDialog("Insira a terceira nota: "));
        nota4 = Double.parseDouble(JOptionPane.showInputDialog("Insira a quarta nota:"));
        
        
        
        mediafinal = (nota1 + nota2 + nota3 + nota4)/ 4;
        
        if(mediafinal>=6){
            JOptionPane.showMessageDialog(null,"Aprovado");
        }
        else if( mediafinal >=3 && mediafinal<=6){
            JOptionPane.showMessageDialog(null,"Exame");
        
    }
        else{
            JOptionPane.showMessageDialog(null,"Reprovado");
        }
        
    }
    
    
}
