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
public class Punto16 {
    
    //Dado un monto calcular el descuento. De esta forma el descuento:
    //25% si m>=300
    //20% si 150<=m<300
    //no hay descuento si m<150
    
    public static void main(String[] args) {
        
        int monto, total; 
        
        monto = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingreser el monto")); 
        
        if (monto>=300){
            total = monto-(monto*25/100);
            JOptionPane.showMessageDialog(null,"El monto total con descuento es:"+total); 
        }
        else if (monto>=150 && monto<300){
            total = monto-(monto*20/100);
            JOptionPane.showMessageDialog(null,"El monto total con descuento es:"+total); 
        }
        else if (monto<150){
            JOptionPane.showMessageDialog(null,"No hay descuento, el monto total es: "+monto); 
        }
        
    }
    
}
