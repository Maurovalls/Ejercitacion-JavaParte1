
package ejerciciocinco;

import javax.swing.JOptionPane;

public class Resultado {
    
    public void cuadrado(){
        int num;
        for(int i = 0 ; i < 10; i++)
        {
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero:"));
            System.out.println("El cuadrado de "+num+" es: "+Math.pow(num, 2));
        }
    }
    
    public void multiplos(){
        int num;
        for(int i = 0 ; i < 10; i++)
        {
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero:"));
            if(num % 2 == 0)
            {
            System.out.println(num+" es multiplo de 2");
            }
        }
    }
    
}
