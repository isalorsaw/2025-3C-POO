/*
Enunciado: Pedir dos numeros enteros y mostrar la suma de ellos.
Elaborado por: Ing. Isaias L. Salinas W.
10/09/2025
*/
//Librerias
import javax.swing.JOptionPane;

public class Ejercicio1_2
{
    public static void main(String args[])
    {
      //Variables
      int n1=0;
      int n2=0;
      int suma=0;
      
      //Lectura de Datos
      String cadena=JOptionPane.showInputDialog("Ingrese el Primer Numero");
      n1=Integer.parseInt(cadena);
      
      String cadena2=JOptionPane.showInputDialog("Ingrese el Segundo Numero");
      n2=Integer.parseInt(cadena2);
      
      //Proceso - (Formulas o Calculas)
      suma=n1+n2;
      
      //Salida
      //String salida="La Suma es: "+suma;
      String salida=n1+"+"+n2+"="+suma;
      JOptionPane.showMessageDialog(null,salida);
      //JOptionPane.showMessageDialog(null,salida,"Titulo Arriba",2);
    }
}
