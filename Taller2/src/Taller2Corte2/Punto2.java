/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller2Corte2;

import javax.swing.JOptionPane;

/**
 *
 * @author Daniela
 */
public class Punto2 {

    public static void main(String[] args) {

        //Se solicita el tamano al usuario
        String texto = JOptionPane.showInputDialog("Ingresa el tamaño");
        int numero[] = new int[Integer.parseInt(texto)];

        //creamos las funciones del 
        rellenarNumeroAleatorioArreglo(numero, 0, 9);
        mostrarArreglo(numero);
    }

    //se crea metodo para rellenar el arreglo
    public static void rellenarNumeroAleatorioArreglo(int lista[], int a, int b) {
        for (int i = 0; i < lista.length; i++) {
            //Generamos un número entre los parametros pasados
            lista[i] = ((int) Math.floor(Math.random() * (a - b) + b));
        }
    }

    //a mostrar el contenido y la suma del array y un método privado para generar número aleatorio
    public static void mostrarArreglo(int lista[]) {
        for (int i = 0; i < lista.length; i++) {
            System.out.println("En el indice " + i + " esta el valor " + lista[i]);
        }
    }
}
