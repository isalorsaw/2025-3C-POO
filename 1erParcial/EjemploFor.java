/*
Ingresar 5 numeros y mostrar la sumatoria de ellos   
*/
import javax.swing.JOptionPane;
public class EjemploFor
{
    public static void main(String args[])
    {
        int lim=5;//HASTA
        int num=0;
        int suma=0;
        
        //Ciclo While
        for(int i=1;i<=lim;i++)
        {
            String cadena=JOptionPane.showInputDialog("Ingrese un Numero");
            num=Integer.parseInt(cadena);
            suma=suma+num;        
        }
        JOptionPane.showMessageDialog(null,"La Suma de todos los numeros fue: "+suma);
    }
}