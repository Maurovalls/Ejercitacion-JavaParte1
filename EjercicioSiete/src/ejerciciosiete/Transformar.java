
package ejerciciosiete;

import javax.swing.JOptionPane;

public class Transformar {
    
    public void resultado(){
        for(int i = 0 ; i < 15 ; i++){
        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero negativo:"));
        int resultado;
        if(num < 0){
            resultado = num * -1;
            System.out.println(resultado);
        }
        while(num > 0)
        {
            num = Integer.parseInt(JOptionPane.showInputDialog("Error, el numero debe ser negativo , ingrese un numero negativo:"));
            if(num < 0)
            {
                resultado = num * -1;
                System.out.println(resultado);
                break;
            }
        }
        }
    }
}
