import java.util.ArrayList;
public class TestPlanilla
{
    public static void main(String args[])
    {
        String menu="Menu\n1.Crear un Empleado\n2.Crear un Consultor\n3.Mostrar Datos para Planilla\n4.Buscar e Ingresar Datos"+
        "\n0.Salir";
        int opcion=0;
        
        ArrayList<Trabajador> lista=new ArrayList<Trabajador>();
        
        do
        {
            opcion=ClaseFM.pedirNumero(menu);
            
            if(opcion==1)
            {
                Empleado e=new Empleado();
                lista.add(e);
            }
            else if(opcion==2)
            {
                Consultor c=new Consultor();
                lista.add(c);
            }
            else if(opcion==3)
            {
                imprimirLista(lista);
            }
            else if(opcion==4)
            {
                String cedula=ClaseFM.pedirCadena("Ingrese la Cedula a Buscar");
                Trabajador t=buscarCedula(lista,cedula);
                
                String result="";
                if(t!=null)result=t.toString();
                else result="No se encontro la cedula "+cedula;
                ClaseFM.mostrarMensaje(result);
            }
            
        }while(opcion!=0);
    }
    public static Trabajador buscarCedula(ArrayList lista, String cedula)
    {
        for(int i=0;i<lista.size();i++)
        {
            Trabajador tra=(Trabajador)lista.get(i);
            if(tra.equals(cedula))return tra;
        }
        
        return null;
    }
    public static void imprimirLista(ArrayList lista)
    {
        String cadena="Planilla de Empleados\n";
        for(int i=0;i<lista.size();i++)
        {
            cadena+=lista.get(i).toString()+"\n===================\n";
        }
        ClaseFM.mostrarMensaje(cadena);
    }
}