//Banco de Funciones y Metodos que pueden ser reutilizables en otros ejercicios.
import javax.swing.JOptionPane;
public class ClaseFM
{
     //Metodo: Que recibe una cadena y lo muestra en pantalla
    public static void mostrarMensaje(String cadena)//Metodo
    {
        JOptionPane.showMessageDialog(null,cadena);
    }
    
    //Funcion: Pide un Entero, lo valida y lo retorna al final
    public static int pedirNumero(String msg)
    {
        int num=0;
        boolean seguir=true;
        do
        {
            try
            {
                String entrada=JOptionPane.showInputDialog(msg);
                num=Integer.parseInt(entrada);
                seguir=false;
            }catch(Exception exp)
            {
                mostrarMensaje("Hubo un Error al Ingresar");
            }
            
        }while(seguir==true);
        return num;
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
    //Funcion: Que recibe una cadena y retorna el tamaño
    public static int tamanio(String cadena)//Funcion
    {
        int t=cadena.length();
        return t;
    }
}
   