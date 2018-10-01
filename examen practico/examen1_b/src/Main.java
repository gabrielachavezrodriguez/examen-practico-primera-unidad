
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
        String radio = JOptionPane.showInputDialog("Conversor de temperatura\n"
                + "ingrese el radio de la tuberia en cm");
        String velocidad = JOptionPane.showInputDialog("ingrese la velocidad del flujo de agua en m/s");
        double area = Math.PI * Math.pow(Double.valueOf(radio)/100, 2);
        JOptionPane.showMessageDialog(null, "Por la tuberia fluyen " + (area * Double.valueOf(velocidad)) + " m3");
    }

}
