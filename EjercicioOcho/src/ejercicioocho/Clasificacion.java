
package ejercicioocho;

public class Clasificacion {
    
    public void resultado(int [] notas){
        int suma = 0;
        double promedio;
        int aux = 11;
        for(int i = 0; i < 10 ; i++)
        {
            suma += notas[i];
        }
        promedio = (double)suma / 10;
        System.out.println("El promedio de las notas es de: "+promedio);       
        for(int i = 0; i < 10 ; i++)
        {
            if(notas[i] < aux)
            {
                aux = notas[i];
            }
        }
        System.out.println("La nota mas baja es: "+aux);
    }
}
