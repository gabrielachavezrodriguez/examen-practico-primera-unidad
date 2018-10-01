/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.swing.JOptionPane;

/**
 *
 * @author gala
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double r1 = Double.valueOf(JOptionPane.showInputDialog("ingrese el valor en ohms de la resistencia #1: "));
        double r2 = Double.valueOf(JOptionPane.showInputDialog("ingrese el valor en ohms de la resistencia #2: "));
        double r3 = Double.valueOf(JOptionPane.showInputDialog("ingrese el valor en ohms de la resistencia #3: "));
        double r4 = Double.valueOf(JOptionPane.showInputDialog("ingrese el valor en ohms de la resistencia #4: "));
        double r5 = Double.valueOf(JOptionPane.showInputDialog("ingrese el valoren ohms de la resistencia #5: "));

        double v = Double.valueOf(JOptionPane.showInputDialog("ingrese el voltaje"));

        double re = 1 / (1 / r1 + 1 / r2 + 1 / r3 + 1 / r4 + 1 / r5);
        JOptionPane.showMessageDialog(null, "Resistencia equivalente: " + re + " ohms"
                + "\nIntensidad total: " + (v / re) + " amperes"
                + "\nIntensidad en r1: " + (v / r1) + " amperes"
                + "\nIntensidad en r2: " + (v / r2) + " amperes"
                + "\nIntensidad en r3: " + (v / r3) + " amperes"
                + "\nIntensidad en r4: " + (v / r4) + " amperes"
                + "\nIntensidad en r5: " + (v / r5) + " amperes");
    }

}
