
package principalpoligono;

public class Cuadrado extends Poligono {
    private double lado;
    
    public Cuadrado(double lado){
        super(4);
        this.lado=lado;
    }

    public double getLado() {
        return lado;
    }
    
    @Override
    public String mostrarDatos(){
        return "Cuadrado: "+numLados+" lados"+
                "\n lados: "+lado;
    }
    
    @Override
    public double perimetro(){
         double perimetro=lado*4;
       System.out.println("Perimetro: "+perimetro);
        return perimetro;
    }
}

