/*
 * Examen Refactorizacion
 * Este programa recibirá el nombre y la edad en años de una persona, y calculará la equivalencia a estas
 * en meses, días y horas.
 * @author Sergio Sahuquillo
 */
package lovivido;

import javax.swing.JOptionPane;

public class LoVivido {

    public static void main(String[] args) {
        Calculos C1 = new Calculos();

//Pedimos nombre y edad mediante un cuadro de texto
        C1.setN(JOptionPane.showInputDialog("Escriba su nombre: "));
        C1.setE(JOptionPane.showInputDialog("Escriba su edad: "));

//Transformamos el String en Integer
        C1.setA(Integer.parseInt(C1.getE()));

//Llamamos a los métodos de calculo e impresion
        C1.Calcular();
        C1.mostrar();
//Salida y fin del programa
        System.exit(0);

    }

}
