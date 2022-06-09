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
public class Punto15 {
    
    //Hacer un programa que permita calcular la media aritmética de 10 números negativos y que
    //muestre la media aritmética en la pantalla.

    public static void main(String[] args) {
        
        int num1, num2, num3, num4, num5, num6, num7, num8, num9, num10, media;
        
        //Se solicitan numeros al usuario 
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el primer numero negativo"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el segundo numero negativo"));
        num3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el tercer numero negativo"));
        num4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el cuarto numero negativo"));
        num5 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el quinto numero negativo"));
        num6 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el sexto numero negativo"));
        num7 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el septimo numero negativo"));
        num8 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el octavo numero negativo"));
        num9 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el noveno numero negativo"));
        num10 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el decimo numero negativo"));
        
        //se crea condicional para hallar media arimetica 
        if (num1>0 && num2>0 && num3>0 && num4>0 && num5>0 && num6>0 && num7>0 && num8>0 && num9>0 && num10>0) {
            JOptionPane.showMessageDialog(null, "Por favor ingresar numeros negativos ");
        }
        else if (num1<0 && num2<0 && num3<0 && num4<0 && num5<0 && num6<0 && num7<0 && num8<0 && num9<0 && num10<0) {
            media = (num1+num2+num3+num4+num5+num6+num7+num8+num9+num1)/10;
            JOptionPane.showMessageDialog(null, "La media aritmetica de los numeros es: "+media);
        }
        
    }
}
