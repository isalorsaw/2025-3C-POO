import javax.swing.JOptionPane;
public class Aparte
{ 
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
}