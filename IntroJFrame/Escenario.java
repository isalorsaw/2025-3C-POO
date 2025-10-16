import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;//Fuente o Tipo de Letra
public class Escenario extends JPanel
{
    Fondo f;
    Carrito c;
    public Escenario()
    {
        //f=new Fondo(0,0,"imagenes/fondo.png");
        f=new Fondo(0,0,"imagenes/fondo.jpg");
        setCarrito("imagenes/carrito.png");
        
        //JOptionPane.showMessageDialog(null,"Ancho "+f.ancho+" Alto "+f.alto);
        //JOptionPane.showMessageDialog(null,"Carrito en X "+c.x+" Y "+c.y);
        //y=new Yate();
        //setBackground(Color.YELLOW);
        setSize(f.ancho,f.alto);
    }
    public void setCarrito(String ruta)
    {
        int x=ClaseFM.generaAleatorio(10,f.ancho-100);
        c=new Carrito(x,580,ruta);
    }
    public void paint(Graphics g)
    {
        super.paint(g);//Linea oblugatoria para dibujar en el panel
        
        g.setColor(Color.RED);
        g.setFont(new Font("Arial",Font.BOLD,18));
        g.drawString("Elaborado por Ing Isaias L. Salinas"+" "+c.toString(),10,f.alto+30);
        
        f.dibuja(g);
        c.dibuja(g);
    }
}