
package Interfaz;

abstract public class Juego 
{
 JugadorHumano [] listaJ;//crea una lista de jugadores humanos
    JugadorMaquina mijug;//crea un jugador maquina      
    Dado misDados = new Dado();
    String Dado1;
    Jugadas misJugadas;
    public int turno()
    { return 1;
    }
    public Juego(int n)//constructor de la clase, requier un int n= numero de jugadores
    {

        if(n==1)//si n=1, se crea un jugador huano y una maquina
        {JugadorHumano jug1=new JugadorHumano("",0,0);
         JugadorMaquina jugM=new JugadorMaquina("Chupaco",0,0);
        }
        else//sino se declara una lista de jugadores humanos de tamano n
        {
            listaJ=new JugadorHumano[n];
            for(int i=0; i<n;i++)
            {listaJ[i]=new JugadorHumano("",0,0);
            }
        }
    }
    public void establecerNombresJugadores(String n, int i)//n= nombre i//pocision
    {  
        listaJ[i-1].llenarNombre(n);//toma al jugador i y llama a su metodo llenarnombre();
    }
    public void tirarDado()
    {
        misDados.tirarDado();
    }   
    public void pedirDado1()
    {
        Dado1=misDados.devolverDado1();
    }
    public String devolverD1()
    {
        return Dado1;
    }
            
            
}
