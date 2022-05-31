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
public class Punto5 {
    
    public static void main(String[] args) {
        
        //se declaran variables 
        int num1, num2; 
        
        //se solicitan numeros al usuario
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el primer numero"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el segundo numero"));
        
        //se crea condicion para comprobar cual es el numero mayor y el numero menor 
        if (num1>num2){
        JOptionPane.showMessageDialog(null, "El numero mayor es:" +num1+ "Numero menor es:" +num2);
        }
        else if (num1<num2) {
        JOptionPane.showMessageDialog(null, "El numero mayor es:" +num2+ "Numero menor es:" +num1);
        }
                      
    }
    
}
