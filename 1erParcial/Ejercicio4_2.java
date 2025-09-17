/*
Enunciado: Programa que pida un número y diga si este número es mayor o menor que 15.
Elaborado por: Ing. Isaias L. Salinas W.
*/
//Librerias
import javax.swing.JOptionPane;

public class Ejercicio4_2
{
    public static void main(String args[])
    {
        //Variables
        int numero=0;
        
        //Entradas
        String entrada=JOptionPane.showInputDialog("Ingrese un Numero");
        numero=Integer.parseInt(entrada);
        
        //Proceso
        String resultado="";//Inicializando vacio
        
        if(numero>15)resultado=numero+" es mayor a 15";
        else if(numero<15)resultado=numero+" es menor a 15";
        else resultado=numero+" es igual a 15";
        
        //Salida
        JOptionPane.showMessageDialog(null,resultado);
    }
}
