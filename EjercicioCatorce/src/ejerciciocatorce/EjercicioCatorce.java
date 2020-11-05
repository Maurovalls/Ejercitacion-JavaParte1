/*
Se tienen  dos vectores M y N de 5 elementos cada uno. Hacer un algoritmo que escriba la palabra 
“Iguales” si ambos vectores son iguales y “Diferentes” si no lo son. Aclaración: 
Serán iguales cuando en la misma posición de ambos vectores se tenga el mismo valor para todos los elementos. 

 */
package ejerciciocatorce;

public class EjercicioCatorce {

    public static void main(String[] args) {
        int [] m = {1,2,3,4,5};
        int [] n = {1,2,3,4,5};
        Iguales i = new Iguales();
        String result = i.reusltado(m, n);
        System.out.println(result);
    }
    
}
