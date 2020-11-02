/*
 Calcular la utilidad que un trabajador recibe en el reparto anual de utilidades si este se le asigna 
como un porcentaje de su salario mensual que depende de su antigüedad en la empresa de acuerdo con la siguiente tabla:
		Tiempo						Utilidad
	Menos de 1 año						5 % del salario
	1 año o más y menos de 2 años				7% del salario
	2 años o más y menos de 5 años				10% del salario
	5 años o más y menos de 10 años				15% del salario
	10 años o más							20% del salario

 */
package ejerciciotres;

import javax.swing.JOptionPane;

public class EjercicioTres {

    public static void main(String[] args) throws Exception {
       double salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su salario mensual:"));
       int antiguedad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuantos años de antiguedad tiene:\n1-Menos de 1 año."
               + "\n2-1 año o mas y menos de 2 años.\n3-2 años o más y menos de 5 años.\n4-5 años o más y menos de 10 años"
               + "\n5-10 años o más."));
       Trabajador t = new Trabajador(salario,antiguedad);
       System.out.println("La utilidad de usted es de : "+t.utilidad()+"$");
       
    }
    
}
