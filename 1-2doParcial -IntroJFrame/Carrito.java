import java.awt.Graphics;
public class Carrito extends Coordenada
{
    Carrito(int x, int y, String ruta)
    {
        super(x,y,ruta);
    }
    public void dibuja(Graphics g)
    {
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
    }
    public String toString()
    {
        return super.toString();
    }
    //public void detectarChoque(Rectangle rec)
}
