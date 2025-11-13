import java.awt.Graphics;
public class Misil extends Coordenada
{
    int velocidad;
    boolean visible;
    Misil(int x, int y, String ruta)
    {
        super(x,y,ruta);
        velocidad=5;
        visible=true;
    }
    public void dibuja(Graphics g)
    {
        if(visible==true)
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
        if(visible)
        {
            x+=velocidad;
            setRectangle();
        }
    }
}
