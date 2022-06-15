/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller2Corte2;

import java.util.Scanner;

/**
 *
 * @author Daniela
 */
public class Punto6 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        //Se solicita al usuario ingresra una frase
        System.out.println("Escriba una frase");

        //de declarfa variable 
        String frase = s.nextLine();

        //Creamos un array de caracteres
        char caracteres[] = new char[frase.length()];

        //Recorremos la frase y cogemos cada caracter y lo metemos en el arrEGLO
        for (int i = 0; i < frase.length(); i++) {
            caracteres[i] = frase.charAt(i);
            System.out.println(caracteres[i]);
        }

    }
}
