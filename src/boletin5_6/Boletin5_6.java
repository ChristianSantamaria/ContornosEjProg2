/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_6;

import javax.swing.JOptionPane;

/**
 *
 * @author csantamariacameselle
 */
public class Boletin5_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 6 
        int consumo;
        consumo = Integer.parseInt(JOptionPane.showInputDialog("Escriba el consumo: "));
        
        if (consumo <= 100)
            System.out.println("Baixo");
        else if (consumo <= 500)
            System.out.println("Medio");
        else if (consumo <= 1000)
            System.out.println("Alto");
        else if (consumo > 1000)
            System.out.println("Primera necesidad");
        
        
    }
    
}
