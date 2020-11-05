
package ejercicionueve;

import javax.swing.JOptionPane;

public class MayoMenor {
    
    public int mayor(){
        int aux = -1000;
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cuantos numeros vas a ingresar:"));
        for(int i = 0; i < cantidad ; i++)
        {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero:"));
            if(num > aux){
                aux = num;
            }
        }
        return aux;
    }
    
    public int menor(){
        int aux = 1000;
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cuantos numeros vas a ingresar:"));
        for(int i = 0; i < cantidad ; i++)
        {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero:"));
            if(num < aux){
                aux = num;
            }
        }
        return aux;
    }
}
