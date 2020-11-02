
package principalpoligono;

public abstract class Poligono {
    
    protected int numLados;
    
    public Poligono(int numLados){
        this.numLados=numLados;
    }

    public int getNumLados() {
        return numLados;
    }

public String mostrarDatos(){
    return "Poligono : "+numLados;
}

public abstract double perimetro();
    
}
