/*Mario se encuentra ante el castillo final. Puede verlo desde lo alto del muro en el que se encuentra.
En breve podrá entrar en la Cámara de Koopa, enfrentarse (y vencer) al monstruo final y salvar a la princesa.
Sin embargo, tiene ante sí una serie de muros que tendrá que sobrepasar. 
Para eso, saltará desde el primero de ellos, donde se encuentra, al siguiente,
y desde él al siguiente, y así sucesivamente hasta llegar al último.
La pregunta que nos hacemos es, ¿cuántos de estos saltos serán hacia arriba y cuántos hacia abajo? 
Mario realiza un salto hacia arriba cuando tiene que alcanzar un muro que está por encima de él, 
y hacia abajo cuando tiene que alcanzar un muro que está por debajo.

El primer valor de la entrada es un número que indica la cantidad de casos de prueba a evaluar.
Cada caso de prueba comienza con un entero mayor que cero y no mayor que 1000000 que indica el número de muros del escenario 
(recuerda que Mario se encuentra situado en la parte de arriba del primero).
A continuación se proporciona la serie de enteros que indican la altura de cada uno de ellos.

Para cada caso de prueba se mostrará una línea en la que aparecerán dos enteros,
uno con los saltos hacia arriba y otro con los saltos hacia abajo, separados por un espacio.

*/
package lossaltosdemario;

import javax.swing.JOptionPane;

public class LosSaltosDeMario {
    
    public static int n,muros,arreglo[];

    public static void main(String[] args) {
        //Preguntamos cuantos casos de pruebas quiere hacer
        n=Integer.parseInt(JOptionPane.showInputDialog("Cuantos casos de prueba quiere hacer?"));
        System.out.println("Cantidad de casos: "+n);
        salto();
        
       
    }
    
    public static void salto(){
        
        int cont=0;
        
        while(cont < n){
            //Preguntamos cuantos muros tiene el caso de prueba
            muros=Integer.parseInt(JOptionPane.showInputDialog("Cuantos muros hay en el caso numero "+(cont+1)));
            
            //Validacion para que la cantidad de muros sea de 1 a 1000000
            while(muros <= 0 && muros > 1000000){
                JOptionPane.showMessageDialog(null,"Error, la cantidad de muros debe ser de 1 a 1000000");
                muros=Integer.parseInt(JOptionPane.showInputDialog("Cuantos muros hay en el caso numero "+(cont)));
                if(muros > 0 && muros <=1000000){
                    break;
                }
            }
            
            //Ingresamos los metros de los muros
            arreglo=new int[muros];
            for(int i=0; i<arreglo.length; i++){
                //Le pedimos al usuario que ingrese el tamaño de cada muro
                arreglo[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del muro numero "+(i+1)));
            }
            
            //variables locales para usarla de contadores de saltos
            int saltoArriba=0;
            int saltoAbajo=0;
            int sinSalto=0;
            
            for(int i=0; i<arreglo.length-1; i++){
                if(arreglo[i] < arreglo[i+1]){
                    saltoArriba++;
                }else if(arreglo[i] > arreglo[i+1]){
                    saltoAbajo++;
                }else{
                    sinSalto=0;
                }
            }
            
            
            //Mostramos Datos
            System.out.println(muros);
            for(int i=0; i<arreglo.length; i++){
                System.out.print("{"+arreglo[i]+"]");
            }
            System.out.println("");
            
            if(sinSalto == arreglo.length-1){
                System.out.println("Saltos arriba : "+sinSalto);
                System.out.println("Saltos arriba : "+sinSalto);
            }else{
            System.out.println("Saltos arriba : "+saltoArriba);
            System.out.println("Saltos abajo : "+saltoAbajo);
            }
            
            
            cont++;
            
        }
        
    }
    
}
