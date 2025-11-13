import java.awt.Graphics;
import java.awt.Rectangle;
public class Enemigo extends Coordenada
{
    int velocidad;
    boolean visible;
    Enemigo(int x, int y, String ruta)
    {
        super(x,y,ruta);
        velocidad=5;
        visible=true;
    }
    public void dibuja(Graphics g)
    {
        if(visible)
        {
            g.drawRect(rec.x,rec.y,rec.width,rec.height);
            g.drawImage(imagen,x,y,null);
        }
    }
    public void frenar()
    {
        visible=false;
    }
    public String toString()
    {
        return super.toString();
    }
    public void mover()
    {
        if(visible==true)
        {
            x-=velocidad;
            setRectangle();
        }
    }
    public boolean choque(Rectangle rec)
    {
        return this.rec.intersects(rec);
    }
}
