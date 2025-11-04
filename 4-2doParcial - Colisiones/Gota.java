import java.awt.Graphics;
import java.awt.Rectangle;
public class Gota extends Coordenada
{
    Gota(int x, int y, String ruta)
    {
        super(x,y,ruta);
    }
    public void dibuja(Graphics g)
    {
        g.drawRect(rec.x,rec.y,rec.width,rec.height);
        g.drawImage(imagen,x,y,null);
    }
    public void setImagen(String ruta)
    {
        
    }
    public void mover(char dir)//u=arriba d=abajo l=izq r=derecha
    {
        
    }
    public void cayendo()
    {
        y++;
        setRectangle();
    }
    public Rectangle getRectangle()
    {
        return rec;
    }
    public boolean choque(Rectangle otro)
    {
        return rec.intersects(otro);
    }
    public String toString()
    {
        return super.toString();
    }
    //public void detectarChoque(Rectangle rec)
}
