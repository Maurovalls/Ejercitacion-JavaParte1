
package maquinadegolosinas;

import javax.swing.JOptionPane;

public class MaquinaDeGolosinas {
public static int n,m;
    public static void main(String[] args) {
String[][] nombresGolosinas = {
 
            {"KitKat", "Chicles de fresa", "Lacasitos", "Palotes"},
 
            {"Kinder Bueno", "Bolsa variada Haribo", "Chetoos", "Twix"},
 
 };
 int kitkat=5;
 int chiclesDeFresa=5;
 int lacasitos=5;
 int palotes=5;
 int kinderBueno=5;
 int bolsaVariada=5;
 int chetos=5;
 int twix=5;
boolean x=true;
 
double[][] precio = {
 
  {1.1, 0.8, 1.5, 0.9},
 
  {1.8, 1, 1.2, 1},

 
};
double[][] codigo = {
 
  {0.0, 0.1, 0.2, 0.3},
 
  {1.0, 1.1, 1.2, 1.3},

 
};
while(x){
  int opciones=Integer.parseInt(JOptionPane.showInputDialog("Menu:\n1-Pedir golosina\n2-Mostrar golosinas\n3-Rellenar golosinas\n4-Apagar maquina"));
  switch(opciones){
      case 1:
          System.out.println("Kitkat disponibles: "+kitkat);
          System.out.println("chicles de fresa disponibles: "+chiclesDeFresa);
          System.out.println("lacasitos disponibles: "+lacasitos);
          System.out.println("palotes disponibles: "+palotes);
          System.out.println("KinderBueno disponibles: "+kinderBueno);
          System.out.println("bolsa variadas disponibles: "+bolsaVariada);
          System.out.println("chetos disponibles: "+chetos);
          System.out.println("twix disponibles: "+twix);
          n=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la fila de la golosina que quiere:"));
                  m=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la columna de la golosina que quiere:"));
                      System.out.println("Usted compro: "+nombresGolosinas[n][m]);
                      if(codigo[n][m]==0.0){
                          kitkat--;
                      }else if(codigo[0][1]==0.1){
                          chiclesDeFresa--;
                      }else if(codigo[0][2]==0.2){
                          lacasitos--;
                      }else if(codigo[0][3]==0.3){
                          palotes--;
                      }else if(codigo[1][0]==1.0){
                          kinderBueno--;
                      }else if(codigo[1][1]==1.1){
                          bolsaVariada--;
                      }else if(codigo[1][2]==1.2){
                          chetos--;
                      }else if(codigo[1][3]==1.3){
                          twix--;}
                      
 if(kitkat==0){
     System.out.println("No queda mas kitkat");
 }else if(chiclesDeFresa==0){
     System.out.println("No queda mas chicles de fresa");
 }else if(lacasitos==0){
     System.out.println("No queda mas lacasitos");
 }else if(palotes==0){
     System.out.println("No queda mas lacasotes");
 }else if(kinderBueno==0){
     System.out.println("No queda mas kinder");
 }else if(bolsaVariada==0){
     System.out.println("No queda mas bolsa variada");
 }else if(chetos==0){
     System.out.println("No queda mas chetos");
 }else if(twix==0){
     System.out.println("No queda mas twix");
 }

 
                      
                  break;
      case 2:
          System.out.println("Las golosinas disponibles son:");
          for(int f=0; f<nombresGolosinas.length;f++){
              for(int c=0; c<nombresGolosinas[0].length;c++){
                  System.out.print("["+nombresGolosinas[f][c]+"]");
              }
              System.out.println(" ");
          }
          System.out.println("El codigo de cada golosina es: ");
          for(int f=0; f<codigo.length;f++){
              for(int c=0; c<codigo[0].length;c++){
                  System.out.print("["+codigo[f][c]+"]");
              }
              System.out.println(" ");
          }
          System.out.println("Los precios son: ");
          for(int f=0; f<precio.length;f++){
              for(int c=0; c<precio[0].length;c++){
                  System.out.print("["+precio[f][c]+"]");
              }
              System.out.println(" ");
          }
          break;
      case 3:
          break;
      case 4:
          x=false;
          break;
  }
    }
    }
}
 
  
