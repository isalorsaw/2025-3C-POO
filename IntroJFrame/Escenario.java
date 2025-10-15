import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
public class Escenario extends JPanel
{
    Fondo f;
    Yate y;
    public Escenario()
    {
        f=new Fondo(0,0,"imagenes/fondo.png");
        
        //JOptionPane.showMessageDialog(null,"Ancho "+f.ancho+" Alto "+f.alto);
        
        //y=new Yate();
        //setBackground(Color.YELLOW);
        setSize(f.ancho,f.alto);
    }
    public void paint(Graphics g)
    {
        super.paint(g);//Linea oblugatoria para dibujar en el panel
        
        g.drawString("Elaborado por Ing Isaias L. Salinas",100,100);
        
        f.dibuja(g);
    }
}