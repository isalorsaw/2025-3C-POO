/*
Crear un arreglo de un tamano aleatorio e imprimir   
*/
public class EjemploAleatorio
{
    public static void main(String args[])
    {
        int t=ClaseFM.generaAleatorio(5,10);
        int a[]=new int[t];
        String elementos=ClaseFM.print(a);
        ClaseFM.mostrarMensaje("El tamanio es de "+t+" El arreglo es "+elementos);
    }
}