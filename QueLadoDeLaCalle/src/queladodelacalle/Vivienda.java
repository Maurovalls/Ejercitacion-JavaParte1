
package queladodelacalle;

import javax.swing.JOptionPane;

public class Vivienda {
    
    public int numero;

    public Vivienda() {
    }

    public Vivienda(int numero) {
        this.numero = numero;
    }
    
    public void lado(){

        if( numero % 2 == 0){
            System.out.println("LA VIVIENDA ESTA DEL LADO DERECHO !!");
        }else{
            System.out.println("LA VIVIENDA ESTA DEL LADO IZQUIERDO!!");
             }
    }
}
    

