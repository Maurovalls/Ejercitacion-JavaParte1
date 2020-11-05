
package ejercicioonce;

public class Calcular {
    
    public void resultado(int [] vector){
        int suma = 0;
        int cont = 0;
        double promedio;
        for(int i =0 ; i<vector.length; i++)
        {
            suma += vector[i];
        }
        promedio =(double)suma/vector.length;
        System.out.println("El promedio es de: "+promedio);
        
        for(int i =0 ; i<vector.length; i++)
        {
            if(vector[i] > promedio)
            {
                System.out.println(vector[i]+" es mayor al promedio");
                cont++;
            }
        }
        System.out.println("La cantidad mayor al promedio es de: "+cont);
        
    }
    
    
}
