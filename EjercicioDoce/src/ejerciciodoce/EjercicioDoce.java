/*
Almacenar 15 números en un vector, almacenarlos en otro vector en orden inverso al vector original y mostrar en pantalla, ambos.
 */
package ejerciciodoce;

public class EjercicioDoce {

    public static void main(String[] args) {
       int [] vectorUno = new int [15];      
       System.out.println("Vector uno:");
       for(int i =0; i < vectorUno.length; i++)
       {
           vectorUno[i] = (int)(Math.random()*(1-10)+10);
           System.out.print("["+vectorUno[i]+"]");
       }
       System.out.println("");
       Inverso i = new Inverso();
       i.vectorInverso(vectorUno);
    }
    
}
