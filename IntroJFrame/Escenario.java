import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
public class Escenario extends JPanel
{
    Fondo f;
    Yate y;
    public Escenario()
    {
        f=new Fondo();
        y=new Yate();
        setBackground(Color.YELLOW);
    }
    public void paint(Graphics g)
    {
        super.paint(g);//Linea oblugatoria para dibujar en el panel
        
        g.drawString("Elaborado por Ing Isaias L. Salinas",100,100);
    }
}