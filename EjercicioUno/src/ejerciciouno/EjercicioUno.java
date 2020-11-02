/*Leer 2 números; si son iguales que los multiplique,
si el primero es mayor que el segundo que los reste y si no que los sume.
*/
package ejerciciouno;

import javax.swing.JOptionPane;

public class EjercicioUno {
    
    public static void main(String[] args) {
        int num1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero:"));
        int num2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero:"));
        Iguales i = new Iguales(num1,num2);
        System.out.println(i.resultado());
        
    }
    
}
