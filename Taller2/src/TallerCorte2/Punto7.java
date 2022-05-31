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
public class Punto7 {
    public static void main(String[] args) {
        
        //Se declaran variables 
        int num1, num2, num3; 
        
        //Se solicitan numeros al usuario 
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el primer numero"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el segundo numero"));
        num3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el tercer numero"));
        
        //se crea condicional para demostrar cual es el numero menor 
        if (num1<=num2 && num1<=num3){
            JOptionPane.showMessageDialog(null, "El numero menor es:" +num1);
        }
        else if (num2<=num1 && num2<=num3){
            JOptionPane.showMessageDialog(null, "El numero menor es:" +num2);
        }
        else if (num3<=num1 && num3<=num2){
            JOptionPane.showMessageDialog(null, "El numero menor es:" +num3);
        }
    }
}
