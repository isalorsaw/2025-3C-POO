import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.Graphics;
import java.awt.Rectangle;  
public class Coordenada
{
    int x;
    int y;
    String ruta;
    ImageIcon icono;
    Image imagen;
    int ancho;
    int alto;
    Rectangle rec;
    Coordenada(int x, int y)
    {
        this.x=x;
        this.y=y;
    }
    Coordenada(int x, int y,String ruta)
    {
        this.x=x;
        this.y=y;
        this.ruta=ruta;
        
        this.icono=new ImageIcon(getClass().getResource(ruta));//Dimensiones
        this.imagen=icono.getImage();//Dibujarla en Graphics
        this.ancho=icono.getIconWidth();//Asignar la anchura de la imagen
        this.alto=icono.getIconHeight();//Asigna la altura de la imagen
        setRectangle();
    }
    public void setRectangle()//Crea el Rectangulo de acuerdo a la imagen
    {
        rec=new Rectangle(x,y,ancho-10,alto-10);
    }
    public void setImagen(String ruta)
    {
        System.out.println("Ruta IMagen "+ruta);
        this.ruta=ruta;
        this.icono=new ImageIcon(getClass().getResource(ruta));//Dimensiones
        this.imagen=icono.getImage();//Dibujarla en Graphics
        this.ancho=icono.getIconWidth();//Asignar la anchura de la imagen
        this.alto=icono.getIconHeight();//Asigna la altura de la imagen
    }
    public void actualizarImagen()
    {
        this.ruta=ruta;
        this.icono=new ImageIcon(getClass().getResource(ruta));//Dimensiones
        this.imagen=icono.getImage();//Dibujarla en Graphics
        this.ancho=icono.getIconWidth();//Asignar la anchura de la imagen
        this.alto=icono.getIconHeight();//Asigna la altura de la imagen
    }
    public String toString()
    {
        return "X "+x+" Y "+y;
    }
}