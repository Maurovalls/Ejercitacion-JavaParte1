/*
Cuando necesitamos llegar a una dirección específica, 
es útil conocer la manera en la que las casas se numeran dentro de una calle para no perder demasiado tiempo buscando. 
Dependiendo de las reglas urbanísticas de cada lugar, esa numeración seguirá unas reglas u otras. 
En Japón, por ejemplo, los números se asignan por orden de construcción de los edificios, 
lo que no es algo particularmente amigable para un despistado turista.

En la mayoría de las ciudades y pueblos de Europa, sin embargo, 
se utiliza un mecanismo que facilita la búsqueda, aunque dificulta los cambios si se construyen o derrumban edificios.
En concreto, se elige uno de los extremos como el inicio de la calle,
utilizándose normalmente como criterio aquél que esté más cerca de un punto significativo de la ciudad
(el centro urbano, el ayuntamiento, un río, el mar…). Una vez hecho eso, las viviendas que quedan al lado izquierdo
(respecto al punto inicial) reciben números impares consecutivos, y las que quedan al lado derecho números pares consecutivos.
Dependiendo del tamaño de cada edificio, 
a menudo ocurre que los números se descompensan y hay portales que tienen enfrente otros con números muy diferentes.

El programa recibirá, por la entrada estándar, un conjunto de casos de prueba, cada uno en una línea.
Cada caso de prueba estará compuesto de un número de vivienda. Se garantiza que nunca será mayor que 1.000.
El último caso, que no deberá procesarse, será el número 0.
*/
package queladodelacalle;

import javax.swing.JOptionPane;

public class QueLadoDeLaCalle {

    public static void main(String[] args) {
      Vivienda v=new Vivienda();
      inicio(v);
    }
    
    public static void inicio(Vivienda v){
        
        boolean empezar=true;
        while(empezar){
            int numero=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de la vivienda:"));
            while(numero > 1000){
                JOptionPane.showMessageDialog(null,"Error, el numero no puede ser mayor a 1000");
                numero=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de la vivienda:"));
                if(numero < 1000){
                    break;
                }
            }
            if(numero == 0){
                empezar=false;
            }else{
            v=new Vivienda(numero);
            v.lado();
            }
        }
    }
    
}
