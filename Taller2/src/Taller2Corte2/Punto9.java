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
public class Punto9 {

    public static void main(String[] args) {

        //Declaramos como constante por lo que dividir
        final int divisor = 23;

        //Insertamos el numero de ID
        String texto = JOptionPane.showInputDialog("Escribe los numero de tu ID");
        int dni = Integer.parseInt(texto);

        //Sacamos el resto
        int res = dni % divisor;

        //Invocamos el metodo
        char letra = letraNIF(res);

        //Mostramos el DNI completo
        System.out.println("Tu ID es: " + dni + letra);

    }

    public static char letraNIF(int res) {

        //Definimos el array de char
        char letrasNIF[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
            'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
            'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        //Devolvemos el valor en la posicion del array
        return letrasNIF[res];
    }
}
