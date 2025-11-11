import javax.swing.JFrame;//Formulario
public class Pral extends JFrame
{
    Escenario e;
    public Pral()//Constructor
    {
        super("Titulo del Proyecto");
        
        e=new Escenario(0);
        e.setFocusable(true);//Prioriza el Escenario.
        add(e);
        
        //setSize(e.getWidth()+100,e.getHeight()+100);//Pixeles Un espacio a la derecha del fondo
        setSize(e.getWidth(),e.getHeight()+100);//Pixeles
        setLocationRelativeTo(null);//Centrar el Frame
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);//Mostrar el Formulario
    }
    public static void main(String args[])
    {
        new Pral();//Constructor
    }
}