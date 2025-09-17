/*
Programa que pida primero nombre, luego apellido y los muestre concatenados  en pantalla.
Elaborado por:
*/
import javax.swing.JOptionPane;
public class Ejercicio5
{
    public static void main(String args[])
    {
        //String nombre="";
        //String apellido="";
        
        //Variables
        //String nombre="",apellido="";
        
        //Entradas
        String nombre=JOptionPane.showInputDialog("Ingrese el Nombre");
        String apellido=JOptionPane.showInputDialog("Ingrese el Apellido");
        
        //Proceso
        //String nombrecompleto=nombre+" "+apellido;
        
        //Salida
        JOptionPane.showMessageDialog(null,nombre+" "+apellido);
        
    }
}