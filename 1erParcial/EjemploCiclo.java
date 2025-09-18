/*
Ingresar 5 numeros y mostrar la sumatoria de ellos   
*/
import javax.swing.JOptionPane;
public class EjemploCiclo
{
    public static void main(String args[])
    {
        int i=1;//DESDE
        int lim=5;//HASTA
        int num=0;
        int suma=0;
        
        //Ciclo While
        while(i<=lim)
        {
            String cadena=JOptionPane.showInputDialog("Ingrese un Numero");
            num=Integer.parseInt(cadena);
            
            suma=suma+num;

            i++;//i=i+1
        }
        
        JOptionPane.showMessageDialog(null,"La Suma de todos los numeros fue: "+suma);
    }
}