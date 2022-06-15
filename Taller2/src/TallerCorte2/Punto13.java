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
public class Punto13 {
    //Elabore un programa que permita ingresar 4 números enteros positivo y que los muestre en orden ascendente.
    public static void main(String[] args) {
        
        // se determina las variables 
        int num1, num2, num3, num4; 
        
        //Se solicitan numeros al usuario 
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el primer numero"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el segundo numero"));
        num3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el tercer numero"));
        num4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el cuarto numero"));
        
        //Se crea condicional para mostrar numeros en orden ascendente 
        if (num1<=num2 && num1<=num3 && num1<= num4 && num2<=num3 && num2<=num4 && num3<=num4){
            JOptionPane.showMessageDialog(null, "El orden de los numeros de manera ascendente es:"+num1+","+num2+","+num3+","+num4);
        }
        else if (num1<=num2 && num1<=num3 && num1<= num4 && num2<=num3 && num2<=num4 && num4<=num3){
            JOptionPane.showMessageDialog(null, "El orden de los numeros de manera ascendente es:"+num1+","+num2+","+num4+","+num3);
        }
        else if (num1<=num2 && num1<=num3 && num1<= num4 && num3<=num2 && num3<=num4 && num4<=num2){
            JOptionPane.showMessageDialog(null, "El orden de los numeros de manera ascendente es:"+num1+","+num3+","+num4+","+num2);
        }
        else if (num1<=num2 && num1<=num3 && num1<= num4 && num2<=num3 && num3<=num4 && num2<=num3){
            JOptionPane.showMessageDialog(null, "El orden de los numeros de manera ascendente es:"+num1+","+num2+","+num4+","+num3);
        }
        else if (num1<=num2 && num1<=num3 && num1<= num4 && num3<=num2 && num3<=num4 && num4<=num2){
            JOptionPane.showMessageDialog(null, "El orden de los numeros de manera ascendente es:"+num1+","+num3+","+num4+","+num2);
        }
        else if (num2<=num1 && num2<=num3 && num2<= num4 && num2<=num3 && num2<=num4 && num3<=num4){
            JOptionPane.showMessageDialog(null, "El orden de los numeros de manera ascendente es:"+num1+","+num2+","+num3+","+num4);
        }
        else if (num2<=num1 && num2<=num3 && num2<= num4 && num2<=num3 && num2<=num4 && num4<=num3){
            JOptionPane.showMessageDialog(null, "El orden de los numeros de manera ascendente es:"+num1+","+num2+","+num4+","+num3);
        }
        else if (num2<=num1 && num2<=num3 && num2<= num4 && num2<=num1 && num3<=num4 && num4<=num2){
            JOptionPane.showMessageDialog(null, "El orden de los numeros de manera ascendente es:"+num1+","+num3+","+num4+","+num2);
        }
        else if (num3<=num2 && num3<=num1 && num3<= num4 && num3<=num2 && num3<=num4 && num4<=num2){
            JOptionPane.showMessageDialog(null, "El orden de los numeros de manera ascendente es:"+num3+","+num1+","+num4+","+num2);
        }
        else if (num3<=num2 && num3<=num1 && num3<= num4 && num3<=num2 && num3<=num4 && num4<=num2){
            JOptionPane.showMessageDialog(null, "El orden de los numeros de manera ascendente es:"+num3+","+num2+","+num4+","+num1);
        }
        else if (num3<=num2 && num3<=num1 && num3<= num4 && num3<=num2 && num3<=num4 && num4<=num2){
            JOptionPane.showMessageDialog(null, "El orden de los numeros de menor a mayor es:"+num3+","+num2+","+num1+","+num4);
        }
        else if (num3<=num3 && num3<=num1 && num3<= num4 && num3<=num2 && num3<=num4 && num4<=num2){
            JOptionPane.showMessageDialog(null, "El orden de los numeros de menor a mayor es:"+num2+","+num1+","+num4+","+num3);
        }
        else if (num3<=num2 && num3<=num1 && num1<= num4 && num3<=num2 && num3<=num4 && num4<=num2){
            JOptionPane.showMessageDialog(null, "El orden de los numeros de menor a mayor es:"+num2+","+num1+","+num4+","+num3);
        }
        else if (num3<=num1 && num3<=num4 && num2<= num4 && num2<=num1 && num3<=num4 && num4<=num2){
            JOptionPane.showMessageDialog(null, "El orden de los numeros de menor a mayor es:"+num4+","+num3+","+num1+","+num2);
        }
        else if (num4<=num2 && num4<=num1 && num4<= num3 && num3<=num1 && num3<=num4 && num4<=num2){
            JOptionPane.showMessageDialog(null, "El orden de los numeros de menor a mayor es:"+num4+","+num1+","+num4+","+num2);
        }
        else if (num4<=num2 && num4<=num1 && num4<= num3 && num3<=num2 && num3<=num4 && num4<=num2){
            JOptionPane.showMessageDialog(null, "El orden de los numeros de menor a mayor es:"+num4+","+num2+","+num4+","+num1);
        }
        else if (num4<=num2 && num4<=num1 && num4<= num3 && num3<=num2 && num3<=num4 && num4<=num2){
            JOptionPane.showMessageDialog(null, "El orden de los numeros de menor a mayor es:"+num4+","+num2+","+num1+","+num4);
        }
        else if (num4<=num3 && num4<=num1 && num4<= num3 && num3<=num2 && num3<=num4 && num4<=num2){
            JOptionPane.showMessageDialog(null, "El orden de los numeros de menor a mayor es:"+num4+","+num1+","+num4+","+num3);
        }
        else if (num4<=num3 && num4<=num3 && num4<= num3 && num3<=num2 && num3<=num4 && num4<=num2){
            JOptionPane.showMessageDialog(null, "El orden de los numeros de menor a mayor es:"+num4+","+num1+","+num4+","+num3);
        }
        
        
    }
}
