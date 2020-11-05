/*
Hacer un algoritmo que llene una matriz de 5 * 5 y que almacene la diagonal principal en un vector.
Imprimir el vector resultante. 
 */
package ejerciciodieciseis;

public class EjercicioDieciseis {

    public static void main(String[] args) {
       int [][] matriz = new int[5][5];
       Diagonal d = new Diagonal();
       for(int i =0; i<matriz.length; i++){
            for(int j =0; j<matriz[0].length; j++){
                matriz[i][j]=(int)(Math.random()*(1-10)+10);  
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
       System.out.println("La diagonal principal de la matriz es:");
       d.diagonalPrincipal(matriz);
   
    }

}
