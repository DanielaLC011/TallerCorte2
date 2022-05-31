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
public class Punto6 {
    
    public static void main(String[] args) {
        
        //Se declaran variables 
        int V1; 
        float VmS; 
        
        //Se solicita el valor de Km por hora al usuario
        V1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la velocidad en Km/h"));
        
        //Se determina la formula y se muestra el valor en metros por segundos 
        VmS = V1/3.6f; 
        JOptionPane.showMessageDialog(null, "La velocidad en m/s es:" +VmS);
     
    }
    
}
