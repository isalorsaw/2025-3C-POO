import java.awt.Graphics;
import java.awt.Rectangle;
public class Carrito extends Coordenada
{
    Carrito(int x, int y, String ruta)
    {
        super(x,y,ruta);
    }
    public void dibuja(Graphics g)
    {
        g.drawRect(rec.x,rec.y,rec.width,rec.height);
        g.drawImage(imagen,x,y,null);
    }
    /*public void setImagen(String ruta)
    {
        
    }*/
    public void mover(char dir)//u=arriba d=abajo l=izq r=derecha
    {
        if(dir=='r')//right derecha
        {
             x+=5;
             setImagen("imagenes/carrito_der.png");
        }
        else if(dir=='l')//left izq
        {
            x-=5;
            setImagen("imagenes/carrito_izq.png");
        }
        
        //Muy Importante al mover debo de actualizar el rectangle
        setRectangle();
    }
    public boolean salida(int limiteX)
    {
        if(x<0)return true;
        else if(x>limiteX)return true;
        else return false;
    }
    public String toString()
    {
        return super.toString();
    }
    public boolean choque(Rectangle otro)
    {
        //if(rec.intersects(otro))return true;
        //else return false;
        return rec.intersects(otro);
    }
}
