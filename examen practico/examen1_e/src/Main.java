
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
        double vai = Double.valueOf(JOptionPane.showInputDialog("Calculo de desplazamiento angular\n"
                + "velocidad angular inicial en rad/s: "));
        double vaf = Double.valueOf(JOptionPane.showInputDialog("velocidad angular final en rad/s: "));
        double tiempo = Double.valueOf(JOptionPane.showInputDialog("tiempo de rotación en s: "));
        double radio = Double.valueOf(JOptionPane.showInputDialog("radio de la rueda en m: "));

        double aceleracionAngular = (vaf - vai) / tiempo;
        double velocidadAngularMedia = vai + aceleracionAngular * tiempo;
        double despAngularR = vai * tiempo + aceleracionAngular * tiempo;
        double frecuencia = 1 / (2 * Math.PI / velocidadAngularMedia);
        double dist = despAngularR / radio;
        double velocidad = dist / tiempo;
        double aceleracion = velocidad / tiempo;

        JOptionPane.showMessageDialog(null, "Distancia angular recorrida: " + despAngularR
                + "\nDistancia en metros recorrida: " + dist
                + "\nVelocidad angular promedio recorrida: " + velocidadAngularMedia
                + "\nVelocidad en m/s promedio recorrida: " + velocidad
                + "\nAceleración angular: " + aceleracionAngular
                + "\nAceleración en m/s2: " + aceleracion
                + "\nFrecuencia de giro (en hertz): " + frecuencia);
    }

}
