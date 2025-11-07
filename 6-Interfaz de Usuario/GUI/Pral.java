import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.awt.Graphics;
import java.awt.Font;
import java.awt.Color;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Pral extends JFrame implements MouseListener,ActionListener
{
    ImageIcon boton1;
    Image iboton1;
    JLabel lblimage;
    Rectangle rec;
   public Pral()//Constructor
    {
        super("Titulo del Proyecto");
        setFrame();
        setImagenes();
        this.addMouseListener(this);
        setSize(600,300);//Pixeles
        setResizable(false);
        setLocationRelativeTo(null);//Centrar el Frame
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);//Mostrar el Formulario
    }
    public void mouseExited(MouseEvent evt)
    {}
    public void mousePressed(MouseEvent evt)
    {
        int xx=evt.getX();
        int yy=evt.getY();
        System.out.println(xx+" "+yy);
        
        rec=new Rectangle(30,100,boton1.getIconWidth(),boton1.getIconHeight());
        if(rec.contains(evt.getPoint()))
        {
            JOptionPane.showMessageDialog(null,"HIce Click en la Piedra");
        }
    }
    public void mouseEntered(MouseEvent evt)
    {
        
    }
    public void mouseReleased(MouseEvent evt)
    {
        
    }
    public void mouseClicked(MouseEvent evt)
    {
        if(evt.getSource()==lblimage)
        {
            JOptionPane.showMessageDialog(null,"Click en IMage");
        }
    }
    public void setFrame()
    {
       setImagenes();
    }
    public void setImagenes()
    {
         boton1=new ImageIcon("piedra.png");//Creando el ImageIcon
         iboton1=boton1.getImage();//Creando el Image para Dibujarla en Graphics
         
         lblimage=new JLabel(boton1);
         lblimage.addMouseListener(this);
        //this.ancho=icono.getIconWidth();//Asignar la anchura de la imagen
        //this.alto=icono.getIconHeight();//Asigna la altura de la imagen
        
        //Plasmar el Boton en el Frame;
        lblimage.setBounds(10,10,boton1.getIconWidth(),boton1.getIconHeight());
        //getContentPane().add(lblimage);PLASMAR LA IMAGEN SIN PAINT
    }
    public void actionPerformed(ActionEvent evt)
    {
        
    }
    public void paint(Graphics g)
    {
        super.paint(g);//Linea oblugatoria para dibujar en el panel
        
        g.setColor(Color.RED);
        g.setFont(new Font("Arial",Font.BOLD,18));
        
        //String puntogota=(got!=null)?"Gota "+got.toString():"NO Hay Gota todavia";
        //String puntogota=showGota();
        g.drawString("Elaborado por Ing Isaias L. Salinas",10,100);
        
        //g.drawRect((int)rec.getX(),(int)rec.getY(),boton1.getIconWidth(),boton1.getIconHeight());
        g.drawImage(iboton1,30,100,null);
        //f.dibuja(g);
        //c.dibuja(g);
        //pie.dibuja(g);
        //if(got!=null)got.dibuja(g);
        //dibujarGotas(g);
    }
    public static void main(String args[])
    {
        new Pral();//Constructor
    }
}