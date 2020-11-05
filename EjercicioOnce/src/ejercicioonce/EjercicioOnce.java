/*
Calcular el promedio de 10 valores almacenados en un vector. 
Determinar con el vector anterior, cuántos son mayores que el promedio; mostrar el promedio,
el número de datos mayores que el promedio y una lista de valores mayores que el promedio.
 */
package ejercicioonce;

import javax.swing.JOptionPane;

public class EjercicioOnce {

    public static void main(String[] args) {
        int [] vector = new int [10];
        for(int i = 0; i<vector.length; i++)
        {
            vector[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor para la posicion "+i+" del vector"));
        }
        Calcular c=new Calcular();
        c.resultado(vector);
    }
    
}
