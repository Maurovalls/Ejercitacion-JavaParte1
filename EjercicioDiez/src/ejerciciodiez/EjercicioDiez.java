/*
1. Desarrolle los ejercicios: 
a) Leer tres números diferentes e imprimir el número mayor de los tres. 
b) Leer 10 números e imprimir solamente los múltiplos de 2.
c) Encontrar el menor valor de un conjunto de n números dados.
2. Cree un programa que muestre un menú con las opciones correspondientes a los puntos a), b) y c), y una cuarta opción Terminar.
Entonces al comenzar la ejecución el programa se mostrará lo siguiente:
Qué desea hacer (RESPONDA USANDO LOS NÚMEROS)?
1.	Mostrar el mayor de 3 números.
2.	Mostrar los pares entre 10 números ingresados.
3.	Mostrar el menor valor entre un grupo de números ingresados.
4.	Terminar.
Cada vez que se muestre el resultado de alguna de las opciones, se debe mostrar el menú nuevamente.
El programa debe usar un procedimiento o función que controle el valor ingresado por el usuario,
y responda con un mensaje cuando sea incorrecto. 

Al elegir la opción Terminar, debe mostrar la cantidad de veces que se ejecutó cada opción.

 */
package ejerciciodiez;

import javax.swing.JOptionPane;

public class EjercicioDiez {

    public static void main(String[] args) {
       Resultado r = new Resultado();
       menu(r);
    }
    public static void menu(Resultado r){
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        boolean comenzar = true;
        while(comenzar){
            int op = Integer.parseInt(JOptionPane.showInputDialog("Qué desea hacer (RESPONDA USANDO LOS NÚMEROS)?\n1-Mostrar el mayor de 3 números."
                    + "\n2-Mostrar los pares entre 10 números ingresados.\n3-Mostrar el menor valor entre un grupo de números ingresados."
                    + "\n4-Terminar"));
            switch(op){
                case 1:
                    int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero:"));
                    int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero:"));
                    int num3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tercer numero:"));
                    System.out.println("El numero mayor de los tres es: "+r.mayor(num1, num2, num3));
                    cont1++;
                    break;
                case 2:
                    r.multiplo();
                    cont2++;
                    break;
                case 3:
                    r.menor();
                    cont3++;
                    break;
                case 4:
                    System.out.println("La opcion uno se ejecuto "+cont1+" veces");
                    System.out.println("La opcion dos se eleigio "+cont2+" veces");
                    System.out.println("La opcion tres se eleigio "+cont3+" veces");
                    comenzar = false;
                    break;
                default:
                    error();
                    break;
            }
        }
    }
    
    public static void error(){
        JOptionPane.showMessageDialog(null, "Error, usted ingreso un numero incorrecto");
    }
    
}
