
package ejerciciocuatro;

public class Tabla {
    
    public void tablaCompleta(int num){
        System.out.println("-------------------------------");
        System.out.println("Tabla de multiplicar del "+num);
        System.out.println("-------------------------------");
        for(int i = 0; i <= 10 ; i++){
            System.out.println(num+" * "+i+" = "+(num*i));
        }
    }
}
