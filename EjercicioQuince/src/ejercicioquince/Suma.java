
package ejercicioquince;

public class Suma {
    
    public void sumaColumnas(int [][] m){
        
        for(int j=0; j<m[0].length; j++){
            int suma = 0;
        for(int i = 0; i<m.length; i++){
            suma += m[i][j];
        }
        System.out.println("La suma de la columna "+j+" es :"+suma);
        }

    }
}
