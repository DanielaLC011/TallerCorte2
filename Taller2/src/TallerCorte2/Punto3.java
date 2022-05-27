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
public class Punto3 {
    
    public static void main(String[] args) {
        
        int radio, altura; 
        float pi = 3.1416f, area, volumen;
        
        radio = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el radio"));
        altura = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la altura"));
        
        area = 2*pi*radio*(radio+altura);
        JOptionPane.showMessageDialog(null, "El area del cilindro es:" +area);
        
        volumen = pi*(radio*radio)*altura;
        JOptionPane.showMessageDialog(null, "El volumen del cilindro es:" +volumen);
        
    }   
}
