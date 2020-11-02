/*
Pedir que se ingrese por teclado un número y mostrar la tabla de multiplicar completa del 0 al 10. Imprimir el multiplicando,
el multiplicador y el producto
 */
package ejerciciocuatro;

import javax.swing.JOptionPane;

public class EjercicioCuatro {

    public static void main(String[] args) {
       int numTabla = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero:"));
       Tabla t = new Tabla();
       t.tablaCompleta(numTabla);
    }
    
}
