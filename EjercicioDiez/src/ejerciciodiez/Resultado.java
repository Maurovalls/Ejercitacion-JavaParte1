
package ejerciciodiez;

import javax.swing.JOptionPane;

public class Resultado {
    
    public int mayor(int n, int m, int o){
        if(n > m && n > o)
        {
            return n;
        }
        else if(m > n && m > o)
        {
            return m;
        }
        else
        {
            return o;
        }
    }
    
    public void multiplo(){
        for(int i = 0; i < 10; i++)
        {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero:"));
            if(num % 2 == 0){
                System.out.println(num+" es multiplo de 2");
            }
        }
    }
    
    public void menor(){
        int aux = 1000;
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cuantos numero desea ingresar:"));
        for(int i = 0; i < cantidad; i++)
        {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero:"));
            if(num < aux){
                aux = num;
            }
        }
        System.out.println("El numero menor de los ingresados es: "+aux);
    }
}
