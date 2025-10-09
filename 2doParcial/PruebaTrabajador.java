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
        
        //ClaseFM.mostrarMensaje(tra.toString());
        
        ClaseFM.mostrarMensaje(tra.getNombre());
        
        //tra.setNombre("ISAIAS");
        String n=ClaseFM.pedirCadena("Ingrese un Nuevo nombre para cambiar "+tra.getNombre());
        tra.setNombre(n);
        
        String d=ClaseFM.pedirCadena("Ahora si ingresamos la direccion");
        tra.setDireccion(d);
        
        ClaseFM.mostrarMensaje(tra.toString());
        
        
        
    }
}