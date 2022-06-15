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
public class Punto14 {

    //Se necesita un sistema que tenga tres opciones, si se selecciona la primera se calcula el
    //perímetro de un cuadrado, si la opción es la dos se calcula el perímetro de un triángulo
    //equilátero, y cuando se elija la tres se calcula el perímetro de un círculo. Además de que
    //mandara un mensaje de “error” en caso de presionar cualquier otro número.
    public static void main(String[] args) {

        //Declarando las variables
        int opcionSeleccionada;
        float ladoCuadrado, perCuadrado, lonTriangulo, perTriangulo, rCirculo, perCirculo;

        //Solicitando la opción al usuario
        JOptionPane.showMessageDialog(null, "1. Cuadrado \n 2. trinagulo \n 3. circulo");
        opcionSeleccionada = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la opción: "));

        switch (opcionSeleccionada) {
            //el caso 1 permite calcular el perimetro del cuadrado
            case 1:
                //Calculo el perimetro de un cuadrodo
                System.out.println("cuadrado");
                ladoCuadrado = Float.parseFloat(JOptionPane.showInputDialog(null, "ingrese el lado del cuadrado: "));
                perCuadrado = ladoCuadrado + ladoCuadrado + ladoCuadrado + ladoCuadrado;
                JOptionPane.showMessageDialog(null, "el perimetro del cuadrado es: " + perCuadrado + "cm");
                break;
            //el caso 2 permite calcular el perimetro del triangulo
            case 2:
                //calculo el perimetro de un triangulo
                lonTriangulo = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese la longitud del triangulo: "));
                perTriangulo = 3 * lonTriangulo;
                JOptionPane.showMessageDialog(null, "el perimetro del triangulo es: " + perTriangulo + "cm");
                break;
            //el caso 3 permite calcular el perimetro del circulo
            case 3:
                //Calcular el perimetro de un circulo
                System.out.println("circulo");
                rCirculo = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese la longitud del triangulo: "));
                perCirculo = (2 * 3.1416f) * rCirculo;
                JOptionPane.showMessageDialog(null, "el perimetro del circulo es: " + perCirculo + "cm");
                break;
            //Si no se encuentra la opción se ejecuta el default para informar que no existe la opción
            default:
                //No existe una opcion valida
                System.out.println("opcion no valida");
        }
    }

}
