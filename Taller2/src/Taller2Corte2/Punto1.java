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
public class Punto1 {

    public static void main(String[] args) {

        //Crea un array de 5 posiciones de números con valores pedidos por teclado. Muestra por
        //consola el índice y el valor al que corresponde. Haz dos métodos, uno para rellenar valores
        //y otro para mostrar
        //se define el tamano del arreglo
        final int tamano = 10;
        int n[] = new int[tamano];

        //creamos las funciones del arreglo
        rellenarArreglo(n);
        mostrarArreglo(n);
    }

    //se solicitan los numeros al usuario
    public static void rellenarArreglo(int lista[]) {
        for (int i = 0; i < lista.length; i++) {
            String texto = JOptionPane.showInputDialog("Ingresa un número");
            lista[i] = Integer.parseInt(texto);
        }
    }

    //se muestran los valores solicitados con el arreglo
    public static void mostrarArreglo(int lista[]) {
        for (int i = 0; i < lista.length; i++) {
            System.out.println("En el indice " + i + " esta el valor " + lista[i]);
        }

    }
}
