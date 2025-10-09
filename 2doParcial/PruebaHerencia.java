public class PruebaHerencia
{
    public static void main(String args[])
    {
        Trabajador t=null;
        String menu="Menu\n1.Crear un Empleado\n2.Crear un Consultor\n3.Mostrar Datos del Trabajador";
        
        int opcion=ClaseFM.pedirNumero(menu);
        
        
        switch(opcion)
        {
            case 1:
                t=new Empleado();
            break;
            
            case 2:
                t=new Consultor();
            break;
            
            default:
        }
        ClaseFM.mostrarMensaje(t.toString());
    }
}