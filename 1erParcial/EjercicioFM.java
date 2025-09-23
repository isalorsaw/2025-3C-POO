/*
Crear un Menu repetitivo donde tendremos las siguientes opciones:
MENU
1. Ingrese una Cadena.
2. Mostrar el Tamaño
3. Mostrar el Primer Caracter.
4. Mostrar el Ultimo Caracter.
5. Mostrar el Caracter de Enmedio.
6. Mostrar la Cadena Invertida
7. Mostrar la Cadena Original
0. Salir   
*/
import javax.swing.JOptionPane;
public class EjercicioFM
{
    public static void main(String args[])
    {
        String menu="MENU\n1. Ingrese una Cadena\n2. Mostrar el Tamaño de la Cadena\n3. Mostrar el Primer Caracter.\n"+
        "4. Mostrar el Ultimo Caracter\n5. Mostrar el Caracter de Enmedio\n6. Mostrar la Cadena Invertida"+
        "\n7.Mostrar Cadena\n0. Salir";
        
        int opcion=ClaseFM.pedirNumero(menu);//Pide un numero y lo valida
        String cadena="";
        
        while(opcion!=0)
        {
            if(opcion==1)cadena=ClaseFM.pedirCadena("Ingrese una Cadena");
            
            else if(opcion==2)
            {
                int tam=ClaseFM.tamanio(cadena);
                ClaseFM.mostrarMensaje("El Tamaño de "+cadena+" es "+tam);
            }
            
            else if(opcion==7)ClaseFM.mostrarMensaje("La Cadena es: "+cadena);
            
            opcion=opcion=ClaseFM.pedirNumero(menu);
        }
        
        //ClaseFM.mostrarMensaje("Hola Mundo");//Va a mostrar el mensaje
    }
}