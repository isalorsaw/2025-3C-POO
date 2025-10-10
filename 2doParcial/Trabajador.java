public class Trabajador
{
    //Atributos=Variables
    private String nombre;
    private String direccion;
    private String puesto;
    private String fechanac;
    private String cedula;

    //Constructores.
    //Constructor Vacio
    public Trabajador()
    {
        nombre=ClaseFM.pedirCadena("Ingrese un Nombre");
        direccion=ClaseFM.pedirCadena("Ingrese una Direccion");
        puesto=ClaseFM.pedirCadena("Ingresar un Puesto");
        fechanac=ClaseFM.pedirCadena("Ingrese la Fecha de Nac");
        cedula=ClaseFM.pedirCadena("Ingrese una Cedula");
    }
    
    //Constructor con Parametros
    public Trabajador(String nombre, String direccion, String puesto, String fechanac,
    String cedula)
    {
        this.nombre=nombre;
        this.direccion=direccion;
        this.puesto=puesto;
        this.fechanac=fechanac;
        this.cedula=cedula;
    }
    
    public Trabajador(String cedula, String nombre)
    {
        this.cedula=cedula;
        this.nombre=nombre;
        direccion=puesto=fechanac="";
    }
    
    /*public Trabajador(String c, String n)
    {
        cedula=c;
        nombre=n;
        direccion=puesto=fechanac="";
    }*/
    
    //Funcion
    public String getNombre()
    {
        return nombre;
    }
    //Metodo
    public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }
    public String getDireccion()
    {
        return direccion;
    }
    public void setDireccion(String direccion)
    {
        this.direccion=direccion;
    }
    //Funcion toString me muestra la informacion de los atributos
    public String toString()
    {
        return "Nombre "+nombre+"\nDireccion"+direccion+"\nPuesto"+puesto+
        "\nFechaNac"+fechanac+"\nCedula"+cedula;
    } 
    public boolean equals(String cedula)
    {
        boolean b=this.cedula.equals(cedula);
        
        //Comparar un String con Otro se utilizar equals. str1.equals(str2)
        //Comparar un entero con otro se compara como = ejemplo num1==num2
        return b;
    }
}