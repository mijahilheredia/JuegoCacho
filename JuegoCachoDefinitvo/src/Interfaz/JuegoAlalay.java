
package Interfaz;

public class JuegoAlalay extends Juego
   
{
    public JuegoAlalay(int n)
    {
        super (n);
    }
    public void turno(int turno)
    {
        if(turno==1)
        {
         turno++;
        }
        else
        {
            if(turno==2)
            {
                turno=1;
            }
        }
        
            
    }
}