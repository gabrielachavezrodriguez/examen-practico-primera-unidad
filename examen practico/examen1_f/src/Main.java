
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
        String opcion = JOptionPane.showInputDialog("Calculo de pendiente y area para  𝑦 = 𝑥2"
                + "\n Ingrese una opcion"
                + "\n1)Calcular pendiente para un valor de x"
                + "\n2)Calcular area para dos valores de x");
        if (opcion.equals("1")) {
            double x = Double.valueOf(JOptionPane.showInputDialog("Ingrese el valor de x"));
            double pendiente = 2 * x;
            JOptionPane.showMessageDialog(null, "La pendiente es: " + pendiente);
        } else {
            double xa = Double.valueOf(JOptionPane.showInputDialog("Ingrese el valor de x1"));
            double xb = Double.valueOf(JOptionPane.showInputDialog("Ingrese el valor de x2"));
            double area = Math.pow(xb, 3) / 3 - Math.pow(xa, 3) / 3;
            JOptionPane.showMessageDialog(null, "Area: " + area + " u3");
        }
    }

}
