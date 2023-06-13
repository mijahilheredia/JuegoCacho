package Interfaz;

import java.util.Random;

public class Dado
{
   private nodoDado []d=new nodoDado[5];//crea un arreglo de cinco espacios
   private int [] copy =new int[5];
   Random miRandom= new Random(); //crea un objeto de tipo random
   Jugadas misJugadas;
   nodoDado Dado1 = new nodoDado();
   nodoDado Dado2 = new nodoDado();
   nodoDado Dado3 = new nodoDado();
   nodoDado Dado4 = new nodoDado();
   nodoDado Dado5 = new nodoDado();
   public Dado()
   {
       d[0]=Dado1;
       d[1]=Dado2;
       d[2]=Dado3;
       d[3]=Dado4;
       d[4]=Dado5;
     
   }
   public void tirarDado()
   {  
       tirarDadoTodos();//tira los cinco dados    
   }
   public int[] devolverTodos()
   {   for(int i=0; i<copy.length;i++)
       {
           copy[i]=d[i].numDado;
       }
       return copy;
   }
   
   public  void tirarDadoTodos()//metodo para tirar n dados menores a cinco mayores a uno
   {    int numero=0;
   
           for(int i=0;i<d.length;i++)
      {
       numero= 1+miRandom.nextInt(6);
       d[i].agregarValor(numero);
     
      }  
   } 
  
    public void voltearDado1()
    {
          d[0].agregarValor(7-d[0].numDado);
    }
        public void voltearDado2()
      {
           d[1].agregarValor(7-d[1].numDado);
      }
        public void voltearDado3()
        {
           d[2].agregarValor(7-d[2].numDado);
        }
        public void voltearDado4()
        {
           d[3].agregarValor(7-d[3].numDado);
        }
        public void voltearDado5()
        {
           d[4].agregarValor(7-d[4].numDado);
        }
      
    

    public void tirar(int n)
    {if(n==1)
      {
           d[0].agregarValor(1+miRandom.nextInt(5));
       }
      if(n==2)
      {
           d[1].agregarValor(1+miRandom.nextInt(5));
      }
      if(n==3)
      { 
           d[2].agregarValor(1+miRandom.nextInt(5));
      }
      if(n==4)
      {
           d[3].agregarValor(1+miRandom.nextInt(5));
      }
      if(n==5)
      {
          d[4].agregarValor(1+miRandom.nextInt(5));
      }
    }
    public String devolverDado1()
    {
        return Integer.toString(d[0].numDado);
    }
     public String devolverDado2()
    {
        return Integer.toString(d[1].numDado);
    }
      public String devolverDado3()
    {
        return Integer.toString(d[2].numDado);
    }
       public String devolverDado4()
    {
        return Integer.toString(d[3].numDado);
    }
    public String devolverDado5()
    {
        return Integer.toString(d[4].numDado);
    }

}
