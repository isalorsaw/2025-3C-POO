/*
Ingresar 5 numeros y mostrar la sumatoria de ellos   
*/
import javax.swing.JOptionPane;
public class ConcatenacionCiclos
{
    public static void main(String args[])
    {
        int lim=5;//HASTA
        int num=0;
        int suma=0;
        String pos="";
        String neg="";
        String neu="";
        
        //Ciclo While
        for(int i=1;i<=lim;i++)
        {
            String cadena=JOptionPane.showInputDialog("Ingrese un Numero");
            num=Integer.parseInt(cadena);
            suma=suma+num; 
            
            if(num>0)
            {
                pos=pos+" "+num;
            }
            else if(num<0)
            {
                neg=neg+" "+num;
            }
            else 
            {
                neu=neu+" "+num;
            }
        }
        String result="La Suma de todos los numeros fue: "+suma+"\nLos Numeros Positivos fueron: "+pos+
        "\nLos Numeros Negativos Fueron: "+neg+"\nLos Numeros Neutros Fueron: "+neu;
        JOptionPane.showMessageDialog(null,result);
    }
}
