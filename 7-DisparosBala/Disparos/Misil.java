import java.awt.Graphics;
public class Misil extends Coordenada
{
    int velocidad;
    Misil(int x, int y, String ruta)
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
        x+=velocidad;
    }
}
