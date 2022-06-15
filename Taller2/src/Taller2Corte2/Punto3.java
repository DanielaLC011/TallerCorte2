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
public class Punto3 {

    public static void main(String[] args) {

        //Solicitamos el tamaño al usuario
        String texto = JOptionPane.showInputDialog("Ingrese un tamaño");
        int n[] = new int[Integer.parseInt(texto)];

        //creamos las funciones
        rellenarNumPrimosAleatorioArreglo(n, 1, 100);

        mostrarArreglo(n);

        //determinar numero mayor
        int primoMayor = mayor(n);
        System.out.println("El numero primo más grande es: " + primoMayor);
    }

    public static void rellenarNumPrimosAleatorioArreglo(int lista[], int a, int b) {

        int i = 0;

        //Usamos mejor un while, ya que solo aumentara cuando genere un primo
        while (i < lista.length) {
            int n = ((int) Math.floor(Math.random() * (a - b) + b));
            if (esPrimo(n)) {
                lista[i] = n;
                i++;
            }
        }
    }

    private static boolean esPrimo(int n) {

        //se crea condicional para que numero negativo, el 0 y el 1, son directamente no primos.
        if (n <= 1) {
            return false;
        } else {

            //declaracion de variables de la condicion       
            int prueba;
            int contador = 0;
            //Hacemos la raiz cuadrada y lo usamos para dividir el numero inicial
            prueba = (int) Math.sqrt(n);
            //Bucle que cuenta los numeros divisibles, podemos hacerlo con while
            for (; prueba > 1; prueba--) {
                if (n % prueba == 0) {
                    contador += 1;
                }
            }
            return contador < 1;
        }
    }

    //mostrar el arreglo en consola
    public static void mostrarArreglo(int lista[]) {
        for (int i = 0; i < lista.length; i++) {
            System.out.println("En el indice " + i + " esta el valor " + lista[i]);
        }
    }

    public static int mayor(int lista[]) {
        int mayor = 0;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] > mayor) {
                mayor = lista[i];
            }
        }

        return mayor;
    }
}
