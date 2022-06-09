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
public class Punto10 {
    
    public static void main(String[] args) {
        
        //Se declaran Variables 
        int l1, l2, l3;
        
        //Se solicitan notas al usuario 
        l1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el lado numero 1"));
        l2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el lado numero 2"));
        l3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el lado numero 3"));
        
        //Se crea condicional para identificar cada tipo de triangulos 
        if (l1 == l2 && l1 == l3) {
            JOptionPane.showMessageDialog(null, "Este es un triangulo Equilatero");
        }
        else if (l1==l2 || l1==l3 || l2==l3){
            JOptionPane.showMessageDialog(null, "Este es un triangulo Isoceles");
        }
        else if (l1!=l2 || l1!=l3 || l2!=l3){
            JOptionPane.showMessageDialog(null, "Este es un triangulo Escaleno");
        }
    }
}
