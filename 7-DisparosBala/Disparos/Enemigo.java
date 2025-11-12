import java.awt.Graphics;
import java.awt.Rectangle;
public class Enemigo extends Coordenada
{
    int velocidad;
    Enemigo(int x, int y, String ruta)
    {
        super(x,y,ruta);
        velocidad=5;
    }
    public void dibuja(Graphics g)
    {
        g.drawImage(imagen,x,y,null);
    }
    public String toString()
    {
        return super.toString();
    }
    public void mover()
    {
        x-=velocidad;
    }
    public boolean choque(Rectangle rec)
    {
        return rec.intersects(rec);
    }
}
