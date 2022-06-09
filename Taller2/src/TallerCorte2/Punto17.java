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
public class Punto17 {
    //A un trabajador le descuentan de su sueldo el 10% si su sueldo es menor o igual a 1000.Por
    //encima de1000 y hasta 2000 el 5% del adicional y por encima de 2000 el 3 % del adicional.
    //Calcular el descuento y sueldo neto que recibe el trabajador dado su sueldo.
    
    public static void main(String[] args) {
        
        //se declaran variables
        int sueldo, total; 
        
        //se solicita el valor del sueldo
        sueldo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingreser el monto")); 
        
        //se crea condicional para determinar el sueldo con el descuento
        if (sueldo<=1000){
            total = sueldo-(sueldo*10/100);
            JOptionPane.showMessageDialog(null,"El sueldo con descuento es:"+total); 
        }
        else if (sueldo>1000 && sueldo<=2000){
            total = sueldo-(sueldo*15/100);
            JOptionPane.showMessageDialog(null,"El sueldo con descuento es:"+total); 
        }
        else if (sueldo>2000){
            total = sueldo-(sueldo*18/100);
            JOptionPane.showMessageDialog(null,"El sueldo con descuento es:"+total); 
        }
        
    }
}
