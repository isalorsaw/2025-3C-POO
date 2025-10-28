import javax.swing.JFrame;//Formulario
import javax.swing.JPanel;
public class Pral extends JFrame
{
    JPanel panel;
    Escenario e;
    Escenario2 e2;
    public Pral()//Constructor
    {
        super("Titulo del Proyecto");
        
        
        int alea=ClaseFM.generaAleatorio(10,90);
        ClaseFM.mostrarMensaje(alea+"");
        
        //PREGUNTA DE EBER=======================================
        if(alea%2==0)panel=new Escenario();
        
        else panel=new Escenario2();
        
        
        //e.setFocusable(true);//Prioriza el Escenario.
        //add(e);
        
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
        new Pral();//Constructor
    }
}