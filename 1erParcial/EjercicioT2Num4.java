/*
   Leer y validar un rango de números, Desde y Hasta y que muestre cuantos y cuáles son 
   múltiplos de 2 hay en ese rango
   */
public class EjercicioT2Num4
{
    public static void main(String args[])
    {
        int d=0,h=0,cuantos=0;
        String cuales="";
        
        do
        {
            d=ClaseFM.pedirNumero("Ingrese un Desde");
            h=ClaseFM.pedirNumero("Ingrese un Hasta");
            if(d>h)ClaseFM.mostrarMensaje("Error de Rango");
        }while(d>h);
        //ClaseFM.llenarAleatorio(a,d,h);
        
        
        while(d<=h)
        {
            //ClaseFM.mostrarMensaje(""+d+" hasta "+h);
            if(d%2==0)
            {
                cuantos++;
                cuales=cuales+" "+d;
            }
            d=d+1;
        }
         ClaseFM.mostrarMensaje("Hay "+cuantos+" NUmeros Pares (Multiplos de 2)\nQue son: "+cuales);   
    }
}