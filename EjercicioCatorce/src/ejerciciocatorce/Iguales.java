
package ejerciciocatorce;

public class Iguales {
    
    public String reusltado(int [] m,int [] n){
        int cont = 0;
        for(int i = 0; i < 5; i++)
        {
            if(m[i] == n[i]){
                cont++;
            }
        }
        if(cont == 5)
        {
            return "Iguales";
        }else{
            return "Diferentes";
        }
    }
}
