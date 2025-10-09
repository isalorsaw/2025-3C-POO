public class Consultor extends Trabajador//Empleado por Hora
{
    int horas;
    double tarifa;
    
    public Consultor()
    {
        super();
        horas=ClaseFM.pedirNumero("Ingrese las Horas Trabajadas");
        tarifa=ClaseFM.pedirDecimal("Ingrese tarifa por hora");     
    }
    public String toString()
    {
        return super.toString()+"\nHoras "+horas+"\nTarifa "+tarifa;
    }
}