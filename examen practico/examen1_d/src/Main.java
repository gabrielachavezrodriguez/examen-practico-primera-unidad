
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
        double velocidad = Double.valueOf(JOptionPane.showInputDialog("Calculo de tiro parabolico con 45 grados\n"
                + "Ingrese la velocidad inicial en m/s: "));
        double angulo = 35;
        double alturaMaxima = (Math.pow(velocidad, 2) * Math.pow(Math.sin(Math.toRadians(angulo)), 2)) / (2 * 9.81);
        double distMaxima = (Math.pow(velocidad, 2) * Math.sin(Math.toRadians(angulo * 2))) / 9.81;
        JOptionPane.showMessageDialog(null, "Altura maxima: " + alturaMaxima + " m"
                + "\nDistancia maxima: " + distMaxima + " m");

    }

}
