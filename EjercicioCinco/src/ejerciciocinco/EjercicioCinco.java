/*
 Leer 10 números y obtener su cuadrado
 Leer 10 números e imprimir solamente los múltiplos de 2
 */
package ejerciciocinco;

import javax.swing.JOptionPane;

public class EjercicioCinco {

    public static void main(String[] args) {
        Resultado r = new Resultado();
        System.out.println("Vamos a imprimir los cuadrados de los numeros ingresados");
        r.cuadrado();
        System.out.println("Vamos a imprimir los multiplos de 2");
        r.multiplos();
    }
    
}
