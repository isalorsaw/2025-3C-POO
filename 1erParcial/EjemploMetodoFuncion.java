//Ejemplo de Funciones y Metodos
import javax.swing.JOptionPane;

public class EjemploMetodoFuncion
{
    public static void main(String args[])
    {
        //String cadena="ABC123";
        String cadena=pedirCadena("Ingrese una Cadena");
        int tam=tamanio(cadena);//Funcion
        char prim=primerCaracter(cadena);//Funcion
        
        String result="La Cadena es: "+cadena+
        "\nEl tamaño de la cadena es: "+tam+
        "\nEL primer caracter es: "+prim;
        mostrarMensaje(result);
    }
    //Funcion: Que pida una cadena y la retorna
    public static String pedirCadena(String msg)
    {
        String c="";
        boolean seguir=true;//True/False
        do
        {
            try
            {
                c=JOptionPane.showInputDialog(msg);
                if(c.length()>0)seguir=false;
            }
            catch(Exception exp)
            {
                mostrarMensaje("HUbo un Error");
            }
        }
        while(seguir==true);
        return c;
    }
    //Metodo: Que recibe una cadena y lo muestra en pantalla
    public static void mostrarMensaje(String cadena)//Metodo
    {
        JOptionPane.showMessageDialog(null,cadena);
    }
    //Funcion: Que recibe una cadena y retorna el tamaño
    public static int tamanio(String cadena)//Funcion
    {
        int t=cadena.length();
        return t;
    }
    //Funcion: Que recibe una cadena y retorna el primer caracter
    public static char primerCaracter(String cadena)
    {
        char pc=cadena.charAt(0);
        return pc;
    }
    //Funcion: Que recibe una cadena y retorna el ultimo caracter
    public static char ultimoCaracter(String cadena)
    {
        return ' ';//Hay que desarrollarlo
    }
    //Funcion: Retorna un Boolean si hay una letra enmedio
    public static boolean letraMedio(String cadena)
    {
        return true;//Hay que desarrollarlo
    }
    
    
}