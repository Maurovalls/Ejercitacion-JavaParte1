/*
Leer tres números diferentes e imprimir el número mayor de los tres.
*/
package ejerciciodos;

import javax.swing.JOptionPane;

public class EjercicioDos {

    public static void main(String[] args) {
       int num1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero:"));
       int num2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero:"));
       int num3=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tercer numero:"));
       Mayor m = new Mayor(num1,num2,num3);
       System.out.println(m.resultado());      
    }
    
}
