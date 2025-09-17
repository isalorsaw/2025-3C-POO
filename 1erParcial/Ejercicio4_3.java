/*
Enunciado: Programa que pida un número y diga si este número es mayor o menor que 15.
Elaborado por: Ing. Isaias L. Salinas W.
*/
//Librerias
import javax.swing.JOptionPane;

public class Ejercicio4_3
{
    public static void main(String args[])
    {
        //Variables
        int numero=0;
        
        //Entradas
        String entrada=JOptionPane.showInputDialog("Ingrese un Numero");
        numero=Integer.parseInt(entrada);
        
        //Proceso
        if(numero>15)JOptionPane.showMessageDialog(null,numero+" es mayor a 15");
        else if(numero<15)JOptionPane.showMessageDialog(null,numero+" es menor a 15");
        else JOptionPane.showMessageDialog(null,numero+" es igual a 15");
        
    }
}
