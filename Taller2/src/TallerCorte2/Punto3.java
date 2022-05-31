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
        
        //Se declaran variables 
        int radio, altura; 
        float pi = 3.1416f, area, volumen;
        
        //se solicitan datos al usuario (radio y volumen)
        radio = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el radio"));
        altura = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la altura"));
        
        //Se agrega la formula para sacar el area y mostrarlo
        area = 2*pi*radio*(radio+altura);
        JOptionPane.showMessageDialog(null, "El area del cilindro es:" +area);
        
        //Se agrega la formula para sacar el volumen y mostrarlo
        volumen = pi*(radio*radio)*altura;
        JOptionPane.showMessageDialog(null, "El volumen del cilindro es:" +volumen);
        
    }   
}
