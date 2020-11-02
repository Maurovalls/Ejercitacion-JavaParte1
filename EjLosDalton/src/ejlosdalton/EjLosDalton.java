
package ejlosdalton;

import javax.swing.JOptionPane;

public class EjLosDalton {
    
    public static int n,cantidad;
 

    public static void main(String[] args) {
       
        n=Integer.parseInt(JOptionPane.showInputDialog("Cuantas viñetas hay?"));
        respuesta();
        
     
    }

    public static void respuesta(){
        
        int cont=0;
        while(cont < n-1){
            
            Hermano h=new Hermano();
            Cuadro c = new Cuadro();
            
            cantidad=Integer.parseInt(JOptionPane.showInputDialog("Cuantos hermanos tiene la viñeta numero "+(cont+1)));
            
            while(cantidad < 2){  
                JOptionPane.showMessageDialog(null,"No puede haber menos de 2 hermanos");
                cantidad=Integer.parseInt(JOptionPane.showInputDialog("Cuantos hermanos tiene la viñeta numero "+(cont+1)));
                if(cantidad >=2){
                    break;
                }
            }
            
            for(int i=0; i<cantidad ; i++){
                int altura=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura del hermano numero "+(i+1)));
                
                while(altura < 1 && altura > 1000000){
                JOptionPane.showMessageDialog(null,"Ingreso mal la altura del hermano numero "+(i+1));
                altura =Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura del hermano numero"+(i+1)));
                   if(altura >=1 && altura <= 1000000){
                    break;
                   }
                }
                
                h=new Hermano(altura);
                c.lista.add(h);
                
             }
            
           c.pregunta();
           cont++;
    
        }       
        System.out.println("LA ULTIMA VIÑETA NO SE PROCESA !!");
    }
}

