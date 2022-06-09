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
public class Punto12 {
    
    public static void main(String[] args) {
        
        //se declaran variables
        int valorCompra, total; 
        
        //se solicita el valor de la compra 
        valorCompra = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingreser el valor de la compra")); 
        
        //se crea condicion para mostrar el valor de la compra, con y sin descuento, segun corresponda 
        if (valorCompra>100000){
            total = valorCompra-(valorCompra*10/100);
            JOptionPane.showMessageDialog(null,"El valor total de la compra es:"+total); 
        }
        else if (valorCompra<=100000 && valorCompra>50000){
            total = valorCompra-(valorCompra*2/100);
            JOptionPane.showMessageDialog(null,"El valor total de la compra es:"+total); 
        }
        else if (valorCompra<=50000){
            JOptionPane.showMessageDialog(null,"El valor total de la compra es:"+valorCompra); 
        }
    }
    
}
