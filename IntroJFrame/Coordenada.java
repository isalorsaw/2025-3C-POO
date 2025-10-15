import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.Graphics;
public class Coordenada
{
    int x;
    int y;
    String ruta;
    ImageIcon icono;
    Image imagen;
    int ancho;
    int alto;
    Coordenada(int x, int y)
    {
        this.x=x;
        this.y=y;
    }
    Coordenada(int x, int y,String ruta)
    {
        this.x=this.x;
        this.y=y;
        this.ruta=ruta;
        
        this.icono=new ImageIcon(getClass().getResource(ruta));//Dimensiones
        this.imagen=icono.getImage();//Dibujarla en Graphics
        this.ancho=icono.getIconWidth();//Asignar la anchura de la imagen
        this.alto=icono.getIconHeight();//Asigna la altura de la imagen
    }
}