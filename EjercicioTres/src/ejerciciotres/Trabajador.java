
package ejerciciotres;

public class Trabajador {
    private double salarioMensual;
    private int antiguedad;

    public Trabajador() {
    }

    public Trabajador(double salarioMensual, int antiguedad) {
        this.salarioMensual = salarioMensual;
        this.antiguedad = antiguedad;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
    
    public double utilidad() throws Exception{
        double resultado;
        if(antiguedad == 1)
        {
            resultado = (salarioMensual * 5) / 100;
            return resultado;
        }
        else if(antiguedad == 2)
        {
            resultado = (salarioMensual * 7) / 100;
            return resultado;
        }
        else if(antiguedad == 3)
        {
            resultado = (salarioMensual * 10) / 100;
            return resultado;
        }
        else if(antiguedad == 4){
            resultado = (salarioMensual * 15) / 100;
            return resultado;
        }
        else if(antiguedad == 5)
        {
            resultado = (salarioMensual * 20) / 100;
            return resultado;
        }
        else
        {
            throw new Exception("Error, ingreso mal la opcion");
        }
            
    }

}
