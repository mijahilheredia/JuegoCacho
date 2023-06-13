

package Interfaz;

 abstract public class Jugador
{
    private String nombre;
    private int puntaje;
    private int racha;
    public int [] tabla=new int [11]; 
    public boolean[] registro=new boolean[11];
    private boolean Ganador=false;
    //pos 0 es balas, pos1 es tontos, pos2 es trenes, pos3 es cuadras,
    //pos 4 es quinas, pos 5 es cenas, pos 6 es escalera=todos diferentes consecutivamente,pos7 es full= 2iguales y tres diferentes,
    //pos8 es poker: cuatro iguales y uno diferente, pos 9 y 10=grandes
    public  Jugador(String n, int pun,int rach)//contructor de la clase
    {
       nombre = "";
       puntaje = pun;
       racha = rach;
    }
    public void llenarNombre(String nom)//llenar nombre
    {
      nombre= nom;
    }
    public String getNombre()
    {
        return nombre;
    }
    public void racha(int r)
    {
        racha=r;
    }
    public int racha()
    {
        return racha;
    }
    public void llenarBalas(String Bl)//llenamos la matriz de las balas
    {
        tabla[0]=Integer.parseInt(Bl+"");
    }
    public void llenarTontos(String Tn)//llenamos la matriz de los tontos y asi sucesivamente
    {
        tabla[1]=Integer.parseInt(Tn+"");
    }
    public void llenarTrenes(String Tr)
    {
         tabla[2]=Integer.parseInt(Tr+"");
    }
    public void llenarCuadras(String Cd)
    {
        tabla[3]=Integer.parseInt(Cd+"");
    }
    public void llenarQuinas(String Qu)
    {
        tabla[4]=Integer.parseInt(Qu+"");
    }
    public void llenarCenas(String Cn)
    {
        tabla[5]=Integer.parseInt(Cn+"");
    }
    public void llenarEscalera()
    {
       tabla[6]=25;    
    }
    public void llenarEscalera2(int mano)
    {
        if(mano==1)
        {
            tabla[6]=25;
        }
        if(mano==2)
        {
            tabla[6]=20;
        }
    }
    public void llenarFull()
    {
        tabla[7]=35;   
    }
    public void llenarFull2(int mano)
    {
        if(mano==1)
        {
            tabla[7]=35;
        }
        if(mano==2)
        {
            tabla[7]=30;
        }
    }
    public void llenarPoker()
    {
        tabla[8]=45;   
    }
    public void llenarPoker2(int mano)
    {
        if(mano==1)
        {
            tabla[8]=45;
        }
        if(mano==2)
        {
            tabla[8]=40;
        }
    }
    public void llenarGrande(int turno)
    {
         if(turno==1)//si es de primera mano termina el juegop
           {tabla[9]=50;
            tabla[10]=50;
            
           }
           else//sino
           {if(tabla[9]!=0)//si la pos 9 esta llena
               {tabla[10]=50;//entonces nos pasamos a la dies y llenamos la diez
               }
             else//si esta vacia
               {
                   tabla[9]=50;//entonces llenamos la 9
               }
           }  
         
    }
    public int[] devVector()
    {
        return tabla;
    }//devuelve el vector con el nuevo puntaje
    public void puntaje()
    {
        getPuntaje(devVector());
    }
    public int getPuntaje(int vector[])//suma los valores de la matriz
    { int sumaTotal=0;
      for(int i=0;i<vector.length;i++)
      {
        sumaTotal=vector[i]+sumaTotal;
      }
      return sumaTotal; 
    }
    public String pidoPuntaje()
    {
        return Integer.toString( getPuntaje(devVector()));
   }
   public void Registro()
   {
       for(int i=0;i<registro.length;i++)
       {
           registro[i]=false;
       }
   }
   public void cambiarRegistro(int n)
   {
           registro[n]=true;   
   }
   public boolean verificarRegistro()//verifica si todas las jugadas ya estan dadas y registradas
   { boolean res=false;
       for(int i=0;i<registro.length;i++)
       {
           if(registro[i]==true)
           {
               res=true;
           }
           else
           {
               res=false;
               break;
           }
       }
       return res;
   }
   
}
