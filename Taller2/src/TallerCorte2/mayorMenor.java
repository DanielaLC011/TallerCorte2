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
public class mayorMenor {
    
    public static void main(String[] args) {
        
        //se declaran variables 
        int a, b, c; 
        
        Scanner leer = new Scanner (System.in);
        
        //se solicitan los numeros al usuario
        System.out.println("Ingrese el primer numero");
            a = leer.nextInt(); 
        
        System.out.println("Ingrese el primer numero");
            b = leer.nextInt(); 
            
        System.out.println("Ingrese el primer numero");
            c = leer.nextInt();     
            
            //se crea condicional para verificar cual es el numero mayor 
            if (a>b && a>c){
            System.out.println("El numero mayor es:" +a);
            }
            else if (b>a && b>c){
            System.out.println("El numero mayor es:" +b);
            }
            else 
            System.out.println("El numero mayor es:" +c);
            
            //se crea condicional para verificar cual es el numero menor 
            if (a<b && a<c){
            System.out.println("El numero menor es:" +a);
            }
            else if (b<a && b<c){
            System.out.println("El numero menor es:" +b);
            }
            else 
            System.out.println("El numero menor es:" +c);
    }
    
    
}
