public class Arreglos
{
    public static void main(String args[])
    {
        int tam=ClaseFM.pedirNumero("Ingrese el Tamaño del Arreglo");
        //Declarando e Inicializando un Arreglo de Enteros
        int arreglo[]=new int[tam];
        llenarXUsuario(arreglo);
        imprimir(arreglo);
        int s=suma(arreglo);
        String salida="La Suma del Arreglo es: "+s;
        ClaseFM.mostrarMensaje(salida);
        
        int b[]={10,50,60};
        imprimir(b);
    }
    //Funcion: Recibe un arreglo y retorna la suma de todos los elementos
    public static int suma(int a[])
    {
        int s=0;
        int i=0;
        while(i<a.length)
        {
            s=s+a[i];
            i++;
        }
        return s;
    }
    //Metodo: Recibe un arreglo y lo llena pidiendo al usuario
    public static void llenarXUsuario(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            a[i]=ClaseFM.pedirNumero("Ingrese un Numero");
        }
    }
    //Metodo: Recibe un arreglo y muestra sus elementos en un mensaje
    public static void imprimir(int a[])
    {
        String cadena="";
        for(int i=0;i<a.length;i++)
        {
            cadena+=a[i]+" ";
        }
        ClaseFM.mostrarMensaje(cadena);
    }
}