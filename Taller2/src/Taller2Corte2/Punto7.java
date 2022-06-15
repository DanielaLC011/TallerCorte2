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
public class Punto7 {

    public static void main(String[] args) {

        //solicitamos el tamaño
        String texto = JOptionPane.showInputDialog("Ingrese un tamaño");
        int tam = Integer.parseInt(texto);

        //Creamos los arrays
        int arreglo1[] = new int[tam];
        int arreglo2[];

        //Rellenamos el arreglo 1
        rellenarNumAleatorioArreglo(arreglo1, 10, 100);

        //Apuntamos el array2 al array1
        arreglo2 = arreglo1;

        //Creamos un nuevo array, usando el array1. Array1 tendra una nueva direccion.
        arreglo1 = new int[tam];

        //Lo volvemos a rellenar, ya que al crear el array de nuevo no contiene los numeros anteriores
        rellenarNumAleatorioArreglo(arreglo1, 10, 100);

        //Contiene el array con el resultado de multiplicar los valores de los arrays
        int arreglo3[] = multiplicador(arreglo1, arreglo2);

        //Mostramos el contenido de los arrays
        System.out.println("Arreglo1");
        mostrarArreglo(arreglo1);

        System.out.println("Arreglo2");
        mostrarArreglo(arreglo2);

        System.out.println("Arreglo3");
        mostrarArreglo(arreglo3);

        //Llamamos al recolector de basura
        System.gc();

    }

    //se crea ciclo para mostrar numnero aleatorio del arreglo
    public static void rellenarNumAleatorioArreglo(int lista[], int a, int b) {
        for (int i = 0; i < lista.length; i++) {
            //Generamos un número entre los parametros pasados
            lista[i] = ((int) Math.floor(Math.random() * (a - b) + b));
        }
    }

    //se crea ciclo para el arreglo
    public static void mostrarArreglo(int lista[]) {
        for (int i = 0; i < lista.length; i++) {
            System.out.println("En el indice " + i + " esta el valor " + lista[i]);
        }
    }

    //se crea  ciclo 
    public static int[] multiplicador(int arreglo1[], int arreglo2[]) {
        int arreglo3[] = new int[arreglo1.length];
        for (int i = 0; i < arreglo1.length; i++) {
            arreglo3[i] = arreglo1[i] * arreglo2[i];
        }
        return arreglo3;
    }
}
