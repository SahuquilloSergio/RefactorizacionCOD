package lovivido;
//importamos la erramienta de Java swing JOptionPane, que mostrara cuadros de texto
import javax.swing.JOptionPane;

/**
 *
 * @author Sergio Sahuquillo
 */

public class Calculos {

//Declaracion de variables 
    String n;
    String e;

    int m;
    int d;
    int h;
    int a;

    public Calculos() {
    }
/**
 * 
 * @param n recibe el valor del nombre introducido
 * @param e recibe el valor de la edad
 * @param m recibe el valor de los meses vividos
 * @param d recibe el valor de los dias vividos
 * @param h recibe el valor de las horas vividas
 * @param a recibe el valor de los años introducidos transformados a un Integer
 */
    public Calculos(String n, String e, int m, int d, int h, int a) {
        this.n = n;
        this.e = e;
        this.m = m;
        this.d = d;
        this.h = h;
        this.a = a;
    }
    

//Instanciamos los Setters y Getters
    public void setN(String n) {
        this.n = n;
    }

    public void setE(String e) {
        this.e = e;
    }

    public void setM(int m) {
        this.m = m;
    }

    public void setD(int d) {
        this.d = d;
    }

    public void setH(int h) {
        this.h = h;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getN() {
        return n;
    }

    public String getE() {
        return e;
    }

    public int getM() {
        return m;
    }

    public int getD() {
        return d;
    }

    public int getH() {
        return h;
    }

    public int getA() {
        return a;
    }
    
    

/**
 * Metodo que realiza los calculos correspondientes a calcular los meses, dias y horas vividos en funcion de los 
 * años que se hallan introducido
*/

    public void Calcular(){   
        m = (a * 12);
        d = (a * 365);
        h = (d * 24);
        
}
    /**
     * Metodo que mostrará los resultados de las operaciones anteriores
     */
    public void mostrar(){
        //Mostramos mediante cuadros de texto el resultado de las operaciones
        JOptionPane.showMessageDialog(null, "Meses: " + m, "Numero de meses vividos de " + n, JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Días: " + d, "Numero de días vividos de " + n, JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Horas: " + h, "Numero de horas vividos de " + n, JOptionPane.INFORMATION_MESSAGE);

    }
}
