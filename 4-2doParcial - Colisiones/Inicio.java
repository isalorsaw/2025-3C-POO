 import javax.swing.ImageIcon;
 import javax.swing.JOptionPane;
public class Inicio
{
    public static void main(String args[])
    {
        
            ImageIcon icono=new ImageIcon(Inicio.class.getResource("imagenes/fondo.png"));
            int seleccion = JOptionPane.showOptionDialog(null,
                           "", 
                           "Preguntados 9 acertadas 0 malas",
                           JOptionPane.YES_NO_CANCEL_OPTION,
                           JOptionPane.QUESTION_MESSAGE,
                           icono,
                           new Object[] { "Iniciar", "Instrucciones", 
                           "Salir" },   // null para YES, NO y CANCEL
                           "Iniciar");
 
            if (seleccion != -1)
            {
                if(seleccion==0)
                {  
                    JOptionPane.showMessageDialog(null,"Iniciar el Juego");
                    new Pral();
                }
                if(seleccion==1)
                {   
                    icono=new ImageIcon(Inicio.class.getResource("imagenes/fondo.jpg"));
                    JOptionPane.showMessageDialog(null,"","Titulo de Arriba",
                    JOptionPane.INFORMATION_MESSAGE,icono);
                }
                if(seleccion==2)
                {
                     JOptionPane.showMessageDialog(null,"Adios");
                }
            }
        }       
}