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
public class Sumatoria {
    
    public static void main(String[] args) {
         
        //Se declaran variables
        int num, suma; 
        suma = 0;
        
        //Ciclo para comprobar la suma de los entreros entre 1-10
        for (num=1; num<=10; num++){
            suma=suma+num;
            System.out.print(num);
            System.out.print("-");
        }
        
        JOptionPane.showMessageDialog(null, "La suma de los numeros enteros del 1-10 es:" +suma);
    }
}
