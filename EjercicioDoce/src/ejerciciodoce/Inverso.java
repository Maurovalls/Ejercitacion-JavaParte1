
package ejerciciodoce;

public class Inverso {
    
    public void vectorInverso(int [] vectorUno){
        System.out.println("Vector inverso:");
        int [] vectorDos = new int [15];
        for(int i =vectorDos.length-1; i >=0; i--)
       {
           vectorDos[i] = vectorUno[i];
           System.out.print("["+vectorDos[i]+"]");
       }
       System.out.println("");
    }
}
