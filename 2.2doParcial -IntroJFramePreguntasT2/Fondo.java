import java.awt.Graphics;
public class Fondo extends Coordenada
{
    Fondo(int x, int y, String ruta)
    {
        super(x,y,ruta);
    }
    public void dibuja(Graphics g)
    {
        g.drawImage(imagen,x,y,null);
    }
    public String toString()
    {
        return super.toString();
    }
}