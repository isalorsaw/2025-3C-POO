public class PruebaTrabajador
{
    public static void main(String args[])
    {
        String nombre=ClaseFM.pedirCadena("Ingrese un Nombre");
        //String direccion=ClaseFM.pedirCadena("Ingrese una Direccion");
        //String puesto=ClaseFM.pedirCadena("Ingresar un Puesto");
        //String fechanac=ClaseFM.pedirCadena("Ingrese la Fecha de Nac");
        String cedula=ClaseFM.pedirCadena("Ingrese una Cedula");
        
        //Trabajador tra=new Trabajador(nombre,direccion,puesto,fechanac,cedula);
        Trabajador tra=new Trabajador(cedula,nombre);
        
        ClaseFM.mostrarMensaje(tra.toString());
    }
}