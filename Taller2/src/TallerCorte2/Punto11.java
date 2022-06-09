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
public class Punto11 {
    public static void main(String[] args) {
        
        //Se declaran variables 
        int num1, num2, num3; 
        
        //Se solicitan numeros al usuario 
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el primer numero"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el segundo numero"));
        num3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el tercer numero"));
        
        //Se crea condicional para mostrar numeros de mayor a menor
        if (num1>=num2 && num1>=num3 && num2>=num3){
            JOptionPane.showMessageDialog(null, "El orden de los numeros de mayor a menor es:"+num1+","+num2+","+num3);
        }
        else if (num1>=num2 && num1>=num3 && num3>=num2){
            JOptionPane.showMessageDialog(null, "El orden de los numeros de mayor a menor es:"+num1+","+num3+","+num2);
        }
        else if (num2>=num1 && num2>=num3 && num1>=num3){
            JOptionPane.showMessageDialog(null, "El orden de los numeros de mayor a menor es:"+num2+","+num1+","+num3);
        }
        else if (num2>=num1 && num2>=num3 && num3>=num1){
            JOptionPane.showMessageDialog(null, "El orden de los numeros de mayor a menor es:"+num2+","+num3+","+num1);
        }
        else if (num3>=num1 && num3>=num2 && num1>=num2){
            JOptionPane.showMessageDialog(null, "El orden de los numeros de mayor a menor es:"+num3+","+num1+","+num2);
        }
        else if (num3>=num1 && num3>=num2 && num2>=num1){
            JOptionPane.showMessageDialog(null, "El orden de los numeros de mayor a menor es:"+num3+","+num2+","+num1);
        }
        
        
        // se crea condicional para mostrar numeros de mayor a menor 
        if (num1<=num2 && num1<=num3 && num2<=num3){
            JOptionPane.showMessageDialog(null, "El orden de los numeros de menor a mayor es:"+num1+","+num2+","+num3);
        }
        else if (num1<=num2 && num1<=num3 && num3<=num2){
            JOptionPane.showMessageDialog(null, "El orden de los numeros de menor a mayor es:"+num1+","+num3+","+num2);
        }
        else if (num2<=num1 && num2<=num3 && num1<=num3){
            JOptionPane.showMessageDialog(null, "El orden de los numeros de menor a mayor es:"+num2+","+num1+","+num3);
        }
        else if (num2<=num1 && num2<=num3 && num3<=num1){
            JOptionPane.showMessageDialog(null, "El orden de los numeros de menor a mayor es:"+num2+","+num3+","+num1);
        }
        else if (num3<=num1 && num3<=num2 && num1<=num2){
            JOptionPane.showMessageDialog(null, "El orden de los numeros de menor a mayor es:"+num3+","+num1+","+num2);
        }
        else if (num3<=num1 && num3<=num2 && num2<=num1){
            JOptionPane.showMessageDialog(null, "El orden de los numeros de menor a mayor es:"+num3+","+num2+","+num1);
        }
        
        
    }
}
