/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TallerCorte2;

import java.util.Scanner;

/**
 *
 * @author Daniela
 */
public class parImpar {
    
    public static void main(String[] args) {
        
        int num;
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese su numero");
        num = leer.nextInt(); 
        
        if (num % 2 == 0)
            System.out.print("El numero es par");
        else 
            System.out.print("El numero es impar");
    }
}
