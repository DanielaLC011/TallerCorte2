/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller2Corte2;

/**
 *
 * @author Daniela
 */
public class Punto4 {

    public static void main(String[] args) {

        //Creamos un arreglo
        int[] nums = new int[100];

        //Declaro las variables 
        int suma = 0;
        double media;

        //ciclo para el arreglo, se asigan numeros y sumar
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 1;
            suma += nums[i];
        }

        //Calcular la media y mostrar la suma y la media
        System.out.println("La suma es: " + suma);

        media = (double) suma / nums.length;

        System.out.println("La media es " + media);

    }
}
