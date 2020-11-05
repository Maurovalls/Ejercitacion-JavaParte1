/*2)Construya un algoritmo que llene una matriz “de clase o estática” de n * n con valores enteros.
El n se pedirá al usuario, siendo un valor entre 3 y 10. 
Cree también dos métodos: uno que muestre la matriz y otro que eleve cada elemento de la matriz al cuadrado. 
Ambos métodos no deben recibir ningún parámetro. 
El método main, debe usar uno de los métodos para mostrar la matriz generada. 
Luego, debe usar el otro para que todos los elementos sean elevados al cuadrado. 
A continuación debe volver a mostrar la matriz con el mismo método que lo hizo antes.

*/
package practica2;

import javax.swing.JOptionPane;

public class Practica2 {
    
    public static int matriz[][],n;


    public static void main(String[] args) {
        
        n=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño de la matriz entre los valores 3 y 10:"));
        
        //condicion por si ingresa valores incorrectos
        while(n<3 || n>10){
            JOptionPane.showMessageDialog(null,"Error, el tamaño debe ser entre 3 y 10");
            n=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño de la matriz entre los valores 3 y 10:"));
            if(n>=3 && n<=10){
                break;
            }
        }
        
        matriz=new int[n][n];
        
        //llenamos matriz con valores aleatores
        for(int f=0; f<matriz.length; f++){
            for(int c=0; c<matriz[0].length;c++){
                matriz[f][c]=(int)(Math.random()*(1-10)+10);
            }
        }
        
        //llamamos metodos
        System.out.println("Matriz:");
        mostrarMatriz();
        System.out.println("Matriz al cuadrado:");
        cuadrado();
        mostrarMatriz();
        

    }
    //metodo para mostrar la matriz
    public static void mostrarMatriz(){
        for(int f=0; f<matriz.length; f++){
            for(int c=0; c<matriz[0].length;c++){
                System.out.print("["+matriz[f][c]+"]");
            }
            System.out.println("");
        }
    }
    
    //metodo para elevar al cuadrado
    public static void cuadrado(){
        for(int f=0; f<matriz.length; f++){
            for(int c=0; c<matriz[0].length;c++){
                matriz[f][c]=matriz[f][c]*matriz[f][c];   
            }
        }
    }
        
        
    }
    

