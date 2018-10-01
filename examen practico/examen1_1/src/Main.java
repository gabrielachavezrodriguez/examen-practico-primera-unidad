
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author gala
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String f = JOptionPane.showInputDialog("Conversor de temperatura\n"
                + "ingrese los grados en farenheit a convertir");
        JOptionPane.showMessageDialog(null, "Grados centigrados: " + ((Integer.valueOf(f) - 32) / 1.8)
                + "\nGrados kelvin: " + ((Integer.valueOf(f) - 32) / 1.8 + 273.15));
    }

}
