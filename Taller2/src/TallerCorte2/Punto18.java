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
public class Punto18 {
    public static void main(String[] args) {
        // se determina las variables 
        int a, b, c, opcionSeleccionada;
       
        
        //Solicitando la opción al usuario
        JOptionPane.showMessageDialog(null, "1. Hallar el mayor \n 2. Hallar el menor \n 3. Hallar el mayor y los menores números son iguales");
        opcionSeleccionada = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la opción: "));
        
        //Se solicitan numeros al usuario 
        a = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el primer numero"));
        b = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el segundo numero"));
        c = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el tercer numero"));

        switch (opcionSeleccionada) {
            //el caso 1 permite hallar el numero mayor
            case 1:
                //Calculo numero mayor
                if (a >= b && a >= c) {
                    JOptionPane.showMessageDialog(null, "El numero menor es:" + a);
                } else if (b >= a && b >= c) {
                    JOptionPane.showMessageDialog(null, "El numero menor es:" + b);
                } else if (c >= a && c >= b) {
                    JOptionPane.showMessageDialog(null, "El numero menor es:" + c);
                }
                break;
            //el caso 2 permite hallar numero menor
            case 2:
                //Calculo numero menor
                if (a <= b && a <= c) {
                    JOptionPane.showMessageDialog(null, "El numero menor es:" + a);
                } else if (b <= a && b <= c) {
                    JOptionPane.showMessageDialog(null, "El numero menor es:" + b);
                } else if (c <= a && c <= b) {
                    JOptionPane.showMessageDialog(null, "El numero menor es:" + c);
                }
                break;
            //el caso 3 permite hallar el mayor y los menores números son iguales
            case 3:
                //Calculo numero menor
                /*if (a <= b && a <= c) {
                    JOptionPane.showMessageDialog(null, "El numero menor es:" + a);
                } else if (b <= a && b <= c) {
                    JOptionPane.showMessageDialog(null, "El numero menor es:" + b);
                } else if (c <= a && c <= b) {
                    JOptionPane.showMessageDialog(null, "El numero menor es:" + c);
                }
                break;*/
                
            //Si no se encuentra la opción se ejecuta el default para informar que no existe la opción
            default:
                //No existe una opcion valida
                System.out.println("opcion no valida");
        }
    }
        
    }
}
