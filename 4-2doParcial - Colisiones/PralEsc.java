import javax.swing.JFrame;//Formulario
import javax.swing.JPanel;
public class PralEsc extends JFrame
{
    Escenario e1;
    Escenario2 e2;
    Escenario3 e3;
    JPanel panel;
    public PralEsc(int nivel)//Constructor
    {
        super("Titulo del Proyecto");
        
        if(nivel==1)
        {
            e1=new Escenario(nivel,this);
            panel=e1;
        }
        else if(nivel==2)
        {
            e2=new Escenario2(nivel,this);
            panel=e2;
        }
        else if(nivel==3)
        {
            e3=new Escenario3(nivel,this);
            panel=e3;
        }
        
        //e=new Escenario();
        panel.setFocusable(true);//Prioriza el Escenario.
        add(panel);
        
        //setSize(e.getWidth()+100,e.getHeight()+100);//Pixeles Un espacio a la derecha del fondo
        setSize(panel.getWidth(),panel.getHeight()+100);//Pixeles
        setLocationRelativeTo(null);//Centrar el Frame
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);//Mostrar el Formulario
    }
    public static void main(String args[])
    {
        new PralEsc(1);//Constructor
    }
}
