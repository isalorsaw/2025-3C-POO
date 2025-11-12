import java.awt.Graphics;
public class Avion extends Coordenada
{
    int velocidad;
    Avion(int x, int y, String ruta)
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
    public void mover(char dir)
    {
        if(dir=='u')y-=velocidad;
        else if(dir=='d')y+=velocidad;
        else if(dir=='r')
        {
             x+=velocidad;
             setImagen("avionder.png");
        }
        else if(dir=='l')
        {
             x-=velocidad;
             setImagen("avionizq.png");
        }
        
        //Limitar que no salga del fondo y que quede a la mitad
    }
}
