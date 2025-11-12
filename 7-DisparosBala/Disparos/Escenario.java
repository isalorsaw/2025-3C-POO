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
    Avion av;
    //Carrito c;
    //Gota got;
    ArrayList<Misil> misils=new ArrayList<Misil>();
    ArrayList<Enemigo> enemigos=new ArrayList<Enemigo>();
    Timer t;//Variable de tipo timer o cronometro
    Timer t2;
    public Escenario()
    {
        //f=new Fondo(0,0,"imagenes/fondo.png");
        f=new Fondo(0,0,"fondo2.png");
        setAvion("avionder.png");
        //got=null;
        inicializarEnemigos();
        
        
        //Incluir el Timer para Mov en Automatico
        t=new Timer(5,null);//5 milisegundos.
        t.addActionListener(this);
        t.start();
        
        t2=new Timer(10,null);//5 milisegundos.
        t2.addActionListener(this);
        t2.start();

        
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
            movMisiles();
            repaint();
        }
        if(evt.getSource()==t2)
        {
            movEnemigos();
            repaint();
        }
        
    }
    public void inicializarEnemigos()
    {
        for(int i=0;i<1;i++)
        {
            int xx=ClaseFM.generaAleatorio(f.ancho-50,f.ancho+50);
            int yy=ClaseFM.generaAleatorio(1,100);
            Enemigo e=new Enemigo(xx,yy,"avionnegroizq.png");
            enemigos.add(e);
        }
    }
    public void dibujarEnemigos(Graphics g)
    {
        for(int i=0;i<enemigos.size();i++)
        {
            //System.out.println(gots.get(i).toString());
            enemigos.get(i).dibuja(g);
        }
    }
    public void movEnemigos()
    {
        for(int i=0;i<enemigos.size();i++)
        {
            //System.out.println(gots.get(i).toString());
            enemigos.get(i).mover();
        }
    }
    public void keyTyped(KeyEvent evt){}
    public void keyReleased(KeyEvent evt){}
    public void keyPressed(KeyEvent evt)
    {
        int code=evt.getKeyCode();
        System.out.println("Codigo de la Tecla "+code);
        
        
        //38 arriba 40 abajo 39 avanzar der 37 izq 32 spacebar
        if(code==38)av.mover('u');//up-arriba
        else if(code==40)av.mover('d');//down=abajo
        else if(code==39)av.mover('r');//right-derecha
        else if(code==37)av.mover('l');//left-izq
        else if(code==32)
        {
            Misil m=new Misil(av.x+40,av.y+100,"bala.png");
            misils.add(m);
        }
        
        //u=arriba d=abajo l=izq r=derecha
        //if(code==39)//derecha
        //c.mover('r');
        
        //if(code==37)c.mover('l');
        repaint();
        
    }
    public void movMisiles()
    {
        for(int i=0;i<misils.size();i++)
        {
            Misil m=misils.get(i);
            m.mover();
        }
    }
    public void dibujarMisiles(Graphics g)
    {
        for(int i=0;i<misils.size();i++)
        {
            Misil m=misils.get(i);
            m.dibuja(g);
        }
    }
    public void mouseClicked(MouseEvent evt){}
    public void mousePressed(MouseEvent evt)
    {
        int x=evt.getX();
        int y=evt.getY();
        System.out.println("Hice Click en Coordenada ("+x+" "+y+")"); 
        //got=new Gota(x,y,"imagenes/gota.png",5);
        //gots.add(got);
        //got=new Gota(x,y,"imagenes/explosion.gif");pregunta de omar
        repaint();
    }
    public void mouseReleased(MouseEvent evt){}
    public void mouseEntered(MouseEvent evt){}
    public void mouseExited(MouseEvent evt){}
    public void setAvion(String ruta)
    {
        int y=ClaseFM.generaAleatorio(10,200);
        av=new Avion(10,y,ruta);
    }
    public void paint(Graphics g)
    {
        super.paint(g);//Linea oblugatoria para dibujar en el panel
        
        g.setColor(Color.RED);
        g.setFont(new Font("Arial",Font.BOLD,18));
        
        //String puntogota=(got!=null)?"Gota "+got.toString():"NO Hay Gota todavia";
        //String puntogota=showGota();
        g.drawString("Elaborado por Ing Isaias L. Salinas"+" ",10,f.alto+30);
        
        f.dibuja(g);
        av.dibuja(g);
        //if(got!=null)got.dibuja(g);
        dibujarMisiles(g);
        dibujarEnemigos(g);
    }
}