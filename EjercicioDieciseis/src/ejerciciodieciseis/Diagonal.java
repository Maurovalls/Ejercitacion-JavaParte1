
package ejerciciodieciseis;

public class Diagonal {
    
    public void diagonalPrincipal(int [][] matriz){
       int [] vector = new int [5];
    
        for(int i =0; i<vector.length; i++){
            vector[i] = matriz[i][i];
            System.out.print("["+vector[i]+"]");
        }
        System.out.println("");
        
     
    }
}
