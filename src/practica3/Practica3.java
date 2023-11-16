/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica3;

import javax.swing.JOptionPane;

/**
 *
 * @author Marco
 */
public class Practica3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String iglesia = JOptionPane.showInputDialog("Escriba el nombre de la iglesia");
        String pastor = JOptionPane.showInputDialog("Escriba el nombre del pastor");
        int i= Integer.parseInt(JOptionPane.showInputDialog("cuantos feligrinos va a ingresar"));
        Felig arrFelig[] = new Felig[i];
        for(int x=0; x<arreglo.length; x++){ 
          JOptionPane.showMessageDialog(null, "Se solicitarán los datos del feligrinio "+x);
          int cedula = Integer.parseInt(JOptionPane.showInputDialog(null,"Escriba la cedula:"));
          String nombre = JOptionPane.showInputDialog("Escriba los apellidos");
          double monto = Double.parseDouble(JOptionPane.showInputDialog("Escriba el monto"));
          arreglo[x]=new Felig(nombre, cedula, monto);
          
          
        
        
        
        
        
        

    }
    
}
