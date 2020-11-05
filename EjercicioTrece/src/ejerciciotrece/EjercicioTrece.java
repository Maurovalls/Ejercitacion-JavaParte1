/*
 Pedir números al usuario y cuando el usuario meta un -1 se terminará el programa.
Al terminar, mostrará lo siguiente:
– mayor numero introducido
– menor numero introducido
– suma de todos los numeros
– suma de los numeros positivos
– suma de los numeros negativos
– media de la suma (la primera que pido)

El número -1 no contara como número.
 */
package ejerciciotrece;

import javax.swing.JOptionPane;

public class EjercicioTrece {

    public static void main(String[] args) {
       iniciar();
    }
    public static void iniciar(){
        boolean empezar = true;
        int auxMayor = -10000;
        int auxMenor = 10000;
        int suma = 0;
        int sumaPositivos = 0;
        int sumaNegativos = 0;
        int cantidad = 0;
        double promedio;
        while(empezar){
            int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero:"));
            if(num == -1){
                empezar = false;
            }
            if(num > auxMayor){
                auxMayor = num;
            }           
            if(num < auxMenor){
                auxMenor = num;
            }           
            suma += num;            
            if(num >= 0){
                sumaPositivos += num;
            }           
            if(num < 0 && num != -1){
                sumaNegativos += num;
            }           
            cantidad++;            
        }
        System.out.println("El mayor numero introducido es: "+auxMayor);
        System.out.println("El menor numero introducido es: "+auxMenor);
        System.out.println("La suma de todos los numeros da: "+(suma+1));
        System.out.println("La suma de los numeros positivos es: "+sumaPositivos);
        System.out.println("La suma de los numeros negativos es: "+sumaNegativos);
        promedio = (double)suma/cantidad;
        System.out.println("La media de la primera suma es: "+promedio);
    }
    
}
