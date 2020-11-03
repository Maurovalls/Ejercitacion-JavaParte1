/*
Suponga que se tiene un conjunto de calificaciones de un grupo de 10 alumnos. 
Realizar un algoritmo para calcular la calificación media y la calificación más baja de todo el grupo.
*/
package ejercicioocho;

public class EjercicioOcho {

    public static void main(String[] args) {
        int [] notas ={10,8,7,7,4,2,9,6,9,4};
        Clasificacion c = new Clasificacion();
        c.resultado(notas);    
    }
    
}
