import java.awt.Graphics;
import java.awt.Rectangle;
public class Piedra extends Coordenada
{
    Piedra(int x, int y, String ruta)
    {
        super(x,y,ruta);
    }
    public void dibuja(Graphics g)
    {
        //g.drawRect(rec.x,rec.y,rec.width,rec.height);
        g.drawImage(imagen,x,y,null);
    }
    public String toString()
    {
        return super.toString();
    }
    public Rectangle getRectangle()
    {
        return rec;
    }
}
