
package ejlosdalton;

import java.util.ArrayList;

public class Cuadro {
    
    public ArrayList <Hermano> lista=new ArrayList <Hermano>();

    public Cuadro() {
    }

    //Metodo pregunta para ver si son dalton o desconocidos
    public void pregunta(){
        int cont=0;
        for(int i=0 ; i<lista.size()-1 ; i++){
            if(lista.get(i).altura < lista.get(i+1).altura){
                cont++;
            }
        }
        
        if(cont == lista.size()-1){
            System.out.println("SON LOS HERMANOS DALTON !!");
        }else{
            System.out.println("SON DESCONOCIDOS !!");
        }
    }

    
}
