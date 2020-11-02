
package principalpoligono;

import javax.swing.JOptionPane;

public class PrincipalPoligono {
public static int numLados;
public static double lado1;
public static double lado2;
public static double lado3;
public static double lado;

    public static void main(String[] args) {
  numLados=Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuantos lados tiene su poligono:"));
  cual();
  
    }
    public static void cual(){
        if(numLados==3){
            Triangulo t;
            lado1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el lado 1:"));
            lado2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el lado 2:"));
            lado3=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el lado 3:"));
            t=new Triangulo(lado1,lado2,lado3);
            System.out.println(t.mostrarDatos());
            t.perimetro();
        }else{
            Cuadrado c;
            lado=Double.parseDouble(JOptionPane.showInputDialog("Ingrese un lado"));
            c=new Cuadrado(lado);
            System.out.println(c.mostrarDatos());
            c.mostrarDatos();
        }
    }
    
}
