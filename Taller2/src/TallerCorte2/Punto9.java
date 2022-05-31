/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TallerCorte2;

import javax.swing.JOptionPane;

/**
 *
 * @author Daniela
 */
public class Punto9 {
    public static void main(String[] args) {
        
        int nota1, nota2, nota3, nota4, promedio; 
        
        nota1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la primera nota"));
        nota2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la segunda nota"));
        nota3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la tercera nota"));
        nota4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cuarta nota"));
        
        if (nota1<=nota2 && nota1<=nota3 && nota1<=nota4){
            promedio = (nota2+nota3+nota4)/3;
            JOptionPane.showMessageDialog(null, "La nota mas baja es:" +nota1);
            JOptionPane.showMessageDialog(null, "El promedio de las 3 notas mas altas es:" +promedio);
        }
        else if (nota2<=nota1 && nota2<=nota3 && nota2<=nota4){
            promedio = (nota1+nota3+nota4)/3;
            JOptionPane.showMessageDialog(null, "La nota mas baja es:" +nota2);
            JOptionPane.showMessageDialog(null, "El promedio de las 3 notas mas altas es:" +promedio);
        }
        else if (nota3<=nota1 && nota3<=nota2 && nota3<=nota4){
            promedio = (nota1+nota2+nota4)/3;
            JOptionPane.showMessageDialog(null, "La nota mas baja es:" +nota3);
            JOptionPane.showMessageDialog(null, "El promedio de las 3 notas mas altas es:" +promedio);
        }
        else if (nota4<=nota1 && nota4<=nota2 && nota4<=nota3){
            promedio = (nota1+nota2+nota3)/3;
            JOptionPane.showMessageDialog(null, "La nota mas baja es:" +nota4);
            JOptionPane.showMessageDialog(null, "El promedio de las 3 notas mas altas es:" +promedio);
        }
    }
}
