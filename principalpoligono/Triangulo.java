
package principalpoligono;

public class Triangulo extends Poligono {
    private double lado1;
    private double lado2;
    private double lado3;
    
    public Triangulo(double lado1,double lado2,double lado3){
        super(3);
        this.lado1=lado1;
        this.lado2=lado2;
        this.lado3=lado3;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }

    @Override
    public String mostrarDatos(){
        return "Triangulo: "+numLados+" lados"+
                "\n lado 1: "+lado1+
                "\n lado 2: "+lado2+
                "\n lado 3: "+lado3;
    }
    
    @Override
    public double perimetro(){
        double perimetro=lado1+lado2+lado3;
       System.out.println("Perimetro: "+perimetro);
        return perimetro;
    }
}
