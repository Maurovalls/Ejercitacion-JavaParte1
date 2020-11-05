/*
 Hacer un algoritmo que llene una matriz de n * n y mostrar por consola. 
 */
package ejercicioquince;

import javax.swing.JOptionPane;

public class EjercicioQuince {
   
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Indicar el tamaño de la matriz n*n:"));
        int [][] matriz = new int[n][n];
        for(int i =0; i<matriz.length; i++){
            for(int j =0; j<matriz[0].length; j++){
                matriz[i][j]=(int)(Math.random()*(1-10)+10);
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
        Suma s= new Suma();
        s.sumaColumnas(matriz);
        
        
    }
    
}
