
package ejercicioseis;

import javax.swing.JOptionPane;

public class Resultado {
    
    public void mostrarResultado(){
        int num;
        for(int i = 0; i < 20; i++)
        {
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero:"));
            if(num > 0)
            {
                System.out.println(num+" es positivo");
            }
            else if(num < 0)
            {
                System.out.println(num+" es nevativo");
            }
            else
            {
                System.out.println(num+" es neutro");
            }
        }
    }
}
