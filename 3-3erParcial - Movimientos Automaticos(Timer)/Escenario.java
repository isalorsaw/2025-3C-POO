import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;//Fuente o Tipo de Letra
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.Timer;//Libreria para Utilizar el Timer
//Librerias Action Listener para el Timer
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Escenario extends JPanel implements MouseListener,KeyListener,ActionListener //implementar los eventos del mouse
{
    Fondo f;
    Carrito c;
    Gota got;
    ArrayList<Gota> gots=new ArrayList<Gota>();
    Timer t;//Variable de tipo timer o cronometro
    public Escenario()
    {
        //f=new Fondo(0,0,"imagenes/fondo.png");
        f=new Fondo(0,0,"imagenes/fondo.jpg");
        setCarrito("imagenes/carrito.png");
        got=null;
        inicializarGotas();
        
        //JOptionPane.showMessageDialog(null,"Ancho "+f.ancho+" Alto "+f.alto);
        //JOptionPane.showMessageDialog(null,"Carrito en X "+c.x+" Y "+c.y);
        //y=new Yate();
        //setBackground(Color.YELLOW);
        //this.setFocusable(true);//Vuelve prioridad el Panel en el JFrame
        //Agregando la accion del Mouse
        
        //Incluir el Timer para Mov en Automatico
        t=new Timer(1,null);//5 milisegundos.
        t.addActionListener(this);
        t.start();
        
        
        //Agregando la accion del Mouse
        this.addMouseListener(this);
        
        //Agregando la accion de las Teclas
        this.addKeyListener(this);
        
        setSize(f.ancho,f.alto);
    }
    public void actionPerformed(ActionEvent evt)
    {
        if(evt.getSource()==t)
        {
            //System.out.println("Activamos el Timer");
            caidaGotas();
            c.mover('r');
            repaint();
        }
    }
    public void inicializarGotas()
    {
        for(int i=0;i<20;i++)
        {
            int xx=ClaseFM.generaAleatorio(1,f.ancho-50);
            int yy=ClaseFM.generaAleatorio(1,100);
            Gota gott=new Gota(xx,yy,"imagenes/gota.png",5);
            gots.add(gott);
        }
    }
    /*public void dibujarGotas(Graphics g)
    {
        for(int i=0;i<gots.size();i++)
        {
            System.out.println(gots.get(i).toString());
        }
    }*/
    public void keyTyped(KeyEvent evt){}
    public void keyReleased(KeyEvent evt){}
    public void keyPressed(KeyEvent evt)
    {
        int code=evt.getKeyCode();
        System.out.println("Codigo de la Tecla "+code);
        
        //u=arriba d=abajo l=izq r=derecha
        if(code==39)//derecha
        c.mover('r');
        
        if(code==37)c.mover('l');
        repaint();
        
    }
    public void mouseClicked(MouseEvent evt){}
    public void mousePressed(MouseEvent evt)
    {
        int x=evt.getX();
        int y=evt.getY();
        System.out.println("Hice Click en Coordenada ("+x+" "+y+")"); 
        got=new Gota(x,y,"imagenes/gota.png",5);
        gots.add(got);
        //got=new Gota(x,y,"imagenes/explosion.gif");pregunta de omar
        repaint();
    }
    public void mouseReleased(MouseEvent evt){}
    public void mouseEntered(MouseEvent evt){}
    public void mouseExited(MouseEvent evt){}
    public void setCarrito(String ruta)
    {
        int x=ClaseFM.generaAleatorio(10,f.ancho-100);
        c=new Carrito(x,580,ruta);
    }
    public String showGota()
    {
        /*String cadena="";
        if(got!=null)cadena=got.toString();
        else cadena="NO Hay Gota Todavia";
        return cadena;*/
        
        //====Si simple==PRUEBA LOG?===VERDADERA==========:====FALSO============
        //String puntogota=(got!=null)?"Gota "+got.toString():"NO Hay Gota todavia";
        //return puntogota;
        return (got!=null)?"Gota "+got.toString():"NO Hay Gota todavia";
    }
    public void dibujarGotas(Graphics g)
    {
        for(int i=0;i<gots.size();i++)
        {
            //cadena+=lista.get(i).toString()+"\n===================\n";
            gots.get(i).dibuja(g);
        }
    }
    public void caidaGotas()
    {
        for(int i=0;i<gots.size();i++)
        {
            Gota gott=gots.get(i);
            gott.caida(300);//Envio el limite de la caida de la gota
        }
    }
    public void paint(Graphics g)
    {
        super.paint(g);//Linea oblugatoria para dibujar en el panel
        
        g.setColor(Color.RED);
        g.setFont(new Font("Arial",Font.BOLD,18));
        
        //String puntogota=(got!=null)?"Gota "+got.toString():"NO Hay Gota todavia";
        String puntogota=showGota();
        g.drawString("Elaborado por Ing Isaias L. Salinas"+" "+c.toString()+" "+puntogota,10,f.alto+30);
        
        f.dibuja(g);
        c.dibuja(g);
        if(got!=null)got.dibuja(g);
        dibujarGotas(g);
    }
}