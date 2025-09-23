public class Rapidito
{
    public static void main(String args[])
    {
        int num1=ClaseFM.pedirNumero("Ingrese el Primer Numero");
        int num2=ClaseFM.pedirNumero("Ingrese el Segundo Numero");
        int suma=num1+num2;
        ClaseFM.mostrarMensaje("La Suma es "+suma);
        ClaseFM.mostrarMensaje(num1+" + "+num2+" = "+suma);
    }
}