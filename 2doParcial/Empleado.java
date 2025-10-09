public class Empleado extends Trabajador//Empleado de Confianza.
{
    private double salario;
    private double impuesto;
    private double porcimp;//ISR
    
    public Empleado()
    {
        super();
        salario=ClaseFM.pedirDecimal("Ingrese el Salario");
        porcimp=ClaseFM.pedirDecimal("Ingrese el Porcentaje de Impuesto");
        impuesto=salario*porcimp;
    }
    public String toString()
    {
        return super.toString()+"\nSalario "+salario+"\nImpuesto "+impuesto;
    }
    
}