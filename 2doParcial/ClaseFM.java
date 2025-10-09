//Banco de Funciones y Metodos que pueden ser reutilizables en otros ejercicios.
import javax.swing.JOptionPane;
public class ClaseFM
{
    //Metodo: Reemplazar dos valores de dos posiciones
    public static void reemplazar(int a[], int p1, int p2)
    {
         int i1=p1-1;
         int i2=p2-1;
         
         int temp=a[i2];//3
         a[i2]=a[i1];
         a[i1]=temp;
    }
    //Metodo: Buscar valor y reemplazar por otro
    public static void reemplazarV(int a[], int v, int reem)
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==v)a[i]=reem;
        }
    }
    //Funcion: Pedir una posicion del arreglo y validarla
    public static int pedirPosicion(int lim)
    {
        boolean seguir=true;
        int pos=0;
        
        do
        {
            pos=pedirNumero("Ingrese una Posicion Valida del Arreglo Debe de ser entre 1 y "+lim);
            if(pos>=1&&pos<=lim)seguir=false;
        }while(seguir==true);
        return pos;
    }
    //Funcion: Que reciba un rango y me retorna un numero aleatorio de ese rango
    public static int generaAleatorio(int d, int h)
    {
        int ale=((int)(Math.random()*(h-d+1)+d));
        return ale;
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
    //Funcion: Recibe un arreglo y un valor y cuanta cuantas veces esta en el arreglo
    public static int contar(int a[], int v)
    {
        int cont=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==v)cont=cont+1;//cont++;
        }
        return cont;
    }
    //Metodo: Recibe un arreglo y lo llena pidiendo al usuario
    public static void llenarXUsuario(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            a[i]=pedirNumero("Ingrese un Numero");
        }
    }
    //Metodo: Recibe un arreglo, un desde y un hasta y me llena de numeros aleatorios de ese rango
    public static void llenarAleatorio(int a[], int d, int h)
    {
        for(int i=0;i<a.length;i++)
        {
            a[i]=generaAleatorio(d,h);
        }
    }
    //Metodo: Recibe un arreglo y muestra sus elementos en un mensaje
    public static void imprimir(int a[])
    {
        String cadena="Elementos del Arreglo\n";
        for(int i=0;i<a.length;i++)
        {
            //cadena+=a[i]+" ";
            cadena+=a[i]+" ";
        }
        mostrarMensaje(cadena);
    }
    public static void invertir(int a[])
    {
        String cadena="Elementos del Arreglo\n";
        for(int i=a.length-1;i>=0;i++)
        {
            //cadena+=a[i]+" ";
            cadena+=a[i]+"\n";
        }
        mostrarMensaje(cadena);
    }
    //Funcion: Recibe un arreglo y retorna todos los elementos en una Cadena
    public static String print(int a[])
    {
        String cadena="";
        for(int i=0;i<a.length;i++)
        {
            cadena+=a[i]+" ";
        }
        return cadena;
    }
    //Funcion: Retorna un boolean si encuentra o no un char. Recibe la cadena y un char
    public static boolean buscarChar(String cadena, char letra)
    {
        for(int i=0;i<cadena.length();i++)
        {
            char le=cadena.charAt(i);
            if(le==letra)return true;
        }
        return false;
    }
    //Funcion: Que pide un caracter, lo valida y lo retorna
    public static char pedirChar(String msg)
    {
        char le=' ';
        boolean seguir=true;
        
        do
        {
            String cadena=pedirCadena(msg);
            if(cadena.length()==1)
            {
                seguir=false;
                le=cadena.charAt(0);
            }
            else mostrarMensaje(cadena+" No es un caracter");
        }while(seguir);//Lo mismo que seguir==true
        
        return le;
    }
     //Metodo: Que recibe una cadena y lo muestra en pantalla
    public static void mostrarMensaje(String cadena)//Metodo
    {
        JOptionPane.showMessageDialog(null,cadena);
    }
    
    //Funcion: Pide un Entero, lo valida y lo retorna al final
    public static int pedirNumero(String msg)
    {
        int num=0;
        boolean seguir=true;
        do
        {
            try
            {
                String entrada=JOptionPane.showInputDialog(msg);
                num=Integer.parseInt(entrada);
                seguir=false;
            }catch(Exception exp)
            {
                mostrarMensaje("Hubo un Error al Ingresar");
            }
            
        }while(seguir==true);
        return num;
    }
     //Funcion: Pide un Decimal, lo valida y lo retorna al final
    public static double pedirDecimal(String msg)
    {
        double num=0;
        boolean seguir=true;
        do
        {
            try
            {
                String entrada=JOptionPane.showInputDialog(msg);
                num=Double.parseDouble(entrada);
                seguir=false;
            }catch(Exception exp)
            {
                mostrarMensaje("Hubo un Error al Ingresar");
            }
            
        }while(seguir==true);
        return num;
    }
    //Funcion: Que pida una cadena y la retorna
    public static String pedirCadena(String msg)
    {
        String c="";
        boolean seguir=true;//True/False
        do
        {
            try
            {
                c=JOptionPane.showInputDialog(msg);
                if(c.length()>0)seguir=false;
            }
            catch(Exception exp)
            {
                mostrarMensaje("HUbo un Error");
            }
        }
        while(seguir==true);
        return c;
    }
    //Funcion: Que recibe una cadena y retorna el tamaño
    public static int tamanio(String cadena)//Funcion
    {
        int t=cadena.length();
        return t;
    }
}
   