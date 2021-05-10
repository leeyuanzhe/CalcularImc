package Projeto;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;


public class CalculadoraImc {
    public static void main (String args[]){
        
      double altura,peso,imc;
      
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura: "));
        peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso: "));
        
        imc = peso/ (altura * altura);
        
        DecimalFormat decimal = new DecimalFormat("0.00");
        String valorFormatado = decimal.format(imc);
        
        
        
        if(imc >= 18.5 && imc <= 24.9){
            JOptionPane.showMessageDialog(null, "IMC = " + valorFormatado + " Peso normal");         
            
        }else if(imc >= 25 && imc <= 29.9){
            JOptionPane.showMessageDialog(null, "IMC = " + valorFormatado + " Sobrepeso");
            
        }else if(imc >= 30 && imc <= 34.9){
            JOptionPane.showMessageDialog(null, "IMC = " + valorFormatado + " Obesidade");
        
        }else if(imc >= 35 && imc <= 39.9){
            JOptionPane.showMessageDialog(null, "IMC = " + valorFormatado + " Obesidade NIVEL:2");
    
        }else if(imc >= 40){
            JOptionPane.showMessageDialog(null, "IMC = " + valorFormatado + " Obesidade NIVEL:3");
    
        
        }else{
            JOptionPane.showMessageDialog(null, "IMC = " + valorFormatado + " Peso baixo");
            
        }
    }      
}
