 import javax.swing.ImageIcon;
 import javax.swing.JOptionPane;
public class Ejemplo2
{
    public static void main(String args[])
    {
        //String imagenes[]={"1.jpg","2.jpg","3.jpg"};//Arreglo
        int d=1;
        int h=7;
        int hasta=5;
        
        for(int i=0;i<hasta;i++)
        {
        
            //int alea=((int)(Math.random()*(h-d+1)+d));
            //int aleatorio=2;
            ImageIcon icono=new ImageIcon(Ejemplo2.class.getResource("fondo.png"));
            int seleccion = JOptionPane.showOptionDialog(null,
                           "", 
                           "Preguntados 9 acertadas 0 malas",
                           JOptionPane.YES_NO_CANCEL_OPTION,
                           JOptionPane.QUESTION_MESSAGE,
                           icono,
                           new Object[] { "Opcion A", "Opcion B", 
                           "Opcion C" },   // null para YES, NO y CANCEL
                           "Opcion A");
 
            if (seleccion != -1)
            {
                if(seleccion==0)
                {  
                    JOptionPane.showMessageDialog(null,"Primera Opcion");
                }
                if(seleccion==1)
                {
                     JOptionPane.showMessageDialog(null,"DOS");
                }
                if(seleccion==2)
                {
                     JOptionPane.showMessageDialog(null,"TRES");
                }
            }
        }
        
    }
}