
package ejercicionueve;

public class Reloj {
    
    public void mostrarHora(){
        for(int h = 0 ; h <=23 ; h++){
            for(int m = 0 ; m <=59 ; m++){
                for(int s = 0 ; s <=59 ; s++){
                    System.out.println(h+" : "+m+" : "+s);
                }
            }
        }
    }
}
