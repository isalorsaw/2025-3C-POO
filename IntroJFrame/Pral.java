import javax.swing.JFrame;//Formulario
public class Pral extends JFrame
{
    Escenario e;
    public Pral()//Constructor
    {
        super("Titulo del Proyecto");
        
        e=new Escenario();
        add(e);
        
        setSize(1200,800);//Pixeles
        setLocationRelativeTo(null);//Centrar el Frame
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);//Mostrar el Formulario
    }
    public static void main(String args[])
    {
        new Pral();//Constructor
    }
}