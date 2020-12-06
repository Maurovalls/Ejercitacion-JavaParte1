/*
Crear una matriz n*n ,en el caso que sea impar calcular
el promedio de los 4 numeros de las posiciones de las esquinas de la matriz mas el numero de la posicion central,
en el caso que sea par que salte un mensaje diciendo que no tiene posicion central.
Llenar la matriz con numeros random del 1 al 15.
En el caso que sea impar el tamaño de la matriz mostrar los 5 numeros a promediar.
 */
package ejercicioprogramcion2;

import javax.swing.JOptionPane;

public class EjercicioProgramcion2 {
    public static int matriz[][],n;

    public static void main(String[] args) {
        n = tamanio();
        if(n %2 == 0){
            JOptionPane.showMessageDialog(null, "El tamaño de la matriz es par, por lo tanto no tiene posicion central");
        }else{
        matriz = new int [n][n];
        for(int f = 0; f < matriz.length; f++){
            for(int c = 0; c < matriz[0].length; c++){
                matriz[f][c] = (int)(Math.random()*(1-15)+15);
                System.out.print("["+matriz[f][c]+"]");
            }
            System.out.println("");
        }
        mostrarNumeros();
        System.out.println("El promedio es: "+promedio());
        }
        
    }
    public static int tamanio(){
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño de la matriz"));
        return numero;
    }
    
    public static void mostrarNumeros(){
        System.out.println("Esquina izquierda arriba: "+matriz[0][0]);
        System.out.println("Esquina derecha arriba: "+matriz[0][matriz[0].length-1]);
        System.out.println("Centro: "+matriz[(matriz.length-1) / 2][(matriz[0].length-1) / 2]);
        System.out.println("Esquina izquierda abajo: "+matriz[matriz.length-1][0]);
        System.out.println("Esquina derecha abajo: "+matriz[matriz.length-1][matriz[0].length-1]);
    }
    
    public static double promedio(){
        int suma = matriz[0][0] + matriz[0][matriz[0].length-1] + matriz[(matriz.length-1) / 2][(matriz[0].length-1) / 2]
                + matriz[matriz.length-1][0] + matriz[matriz.length-1][matriz[0].length-1];
        return (double)suma/5;               
    }
   
}
