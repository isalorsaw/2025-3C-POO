import java.awt.Graphics;
public class Gota extends Coordenada
{
    int velocidad;
    Gota(int x, int y, String ruta,int velocidad)
    {
        super(x,y,ruta);
        setVelocidad(velocidad);
    }
    public void setVelocidad(int velocidad)
    {
        this.velocidad=velocidad;
    }
    public void dibuja(Graphics g)
    {
        g.drawImage(imagen,x,y,null);
    }
    public void setImagen(String ruta)
    {
        
    }
    public void mover(char dir)//u=arriba d=abajo l=izq r=derecha
    {
        
    }
    public void caida(int limiteY)
    {
        y+=velocidad;
        
        if(y>limiteY)
        {
             y=20;
             velocidad+=5;
        }
        //Limite
    }
    public String toString()
    {
        return super.toString();
    }
    //public void detectarChoque(Rectangle rec)
}
