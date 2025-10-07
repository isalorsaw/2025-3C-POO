public class MenuArreglo
{
    public static void main(String args[])
    {
        String menu="Menu\n1.Llenar por Usuario\n2.Llenar Aleatorio\n3.Sumar todos los elementos"+
        "\n4.Mostrar Arreglo Invertido\n5.Contar cuantas veces esta un numero\n9.Imprimir\n"+
        "10.Reemplazar\n11.Reemplazar Valores con otro numero\n0.Salir";
        
        int opcion=0;
        
        int t=ClaseFM.pedirNumero("Ingrese el Tamaño que tendra el arreglo");
        int a[]=new int[t];
        
        do
        {
            opcion=ClaseFM.pedirNumero(menu);
            
            switch(opcion)
            {
                case 1:
                    ClaseFM.llenarXUsuario(a);
                break;
                
                case 2:
                    int d=ClaseFM.pedirNumero("Ingrese un Rango. Cual seria el limite inicial?");
                    int h=ClaseFM.pedirNumero("Cual seria el limite final?");
                    ClaseFM.llenarAleatorio(a,d,h);
                break;
                
                case 3:
                    int s=ClaseFM.suma(a);
                    String ar=ClaseFM.print(a);
                    ClaseFM.mostrarMensaje("Elementos del Arreglo "+ar+"\nLa Suma de los Elementos es: "+s);
                break;
                
                case 4:
                break;
                
                case 5:
                    int v=ClaseFM.pedirNumero("Ingresar un Numero para Buscar y Contar en el Arreglo");
                    int con=ClaseFM.contar(a,v);
                    ar=ClaseFM.print(a);
                    ClaseFM.mostrarMensaje("Elementos del Arreglo "+ar+"\n"+v+" esta "+con+" veces");
                break;
                
                case 9:
                    ClaseFM.imprimir(a);
                break;
                
                case 10:
                    int p1=ClaseFM.pedirPosicion(a.length);
                    int p2=ClaseFM.pedirPosicion(a.length);
                    ClaseFM.mostrarMensaje("Vamos a reemplazar los valores de la Posicion "+p1+" con "+p2);
                    ClaseFM.reemplazar(a,p1,p2);//Intercambiar valores de una posicion
                break;
                
                case 11:
                    int bus=ClaseFM.pedirNumero("Ingrese un Valor a Buscar");
                    int rem=ClaseFM.pedirNumero("Ingrese un Valor para Reemplazar");
                    ClaseFM.reemplazarV(a,bus,rem);//Reemplazar valores de una posicion
                break;
                
                case 0:
                    ClaseFM.mostrarMensaje("Adios!");
                break;
                
                default:
                    ClaseFM.mostrarMensaje("Opcion NO Valida");
                break;
            }
        }while(opcion!=0);
        
    }
}