package Interfaz;



class Jugadas {
    
  private boolean escalera;
  private boolean full;
  private boolean poker;
  private boolean grande;
  private String balas;
  private String tontos;
  private String trenes;
  private String cuadras;
  private String quinas;
  private String cenas;
   boolean [] cajaE= new boolean[4];
  String  [] cajaN=new String[6];
  public Jugadas(int [] dados)
  {  
     escalera=escalera(dados);
     full=full(dados);
     poker=poker(dados);
     grande= grande(dados);
     balas=balas(dados);
     tontos=tontos(dados);
     trenes=trenes(dados);
     cuadras=cuadras(dados);
     quinas=quinas(dados);
     cenas=cenas(dados);
     
  }
  public void reestablecerJugadas(int [] dados2)
  {
     escalera=escalera(dados2);
     full=full(dados2);
     poker=poker(dados2);
     grande= grande(dados2);
     balas=balas(dados2);
     tontos=tontos(dados2);
     trenes=trenes(dados2);
     cuadras=cuadras(dados2);
     quinas=quinas(dados2);
     cenas=cenas(dados2);
  }
  public boolean getEscalera()
  {
    return escalera;
  }
  private boolean escalera(int []vect)//devuelve verdadero si hay escalera en el arrgelo
  {   int [] copy=vect;
      int auxiliar;
      boolean esca;
      for(int i =0; i<copy.length-1; i++)
      {for(int j=0;j<copy.length-1;j++)
       {if(copy[j]>copy[j+1])
        {
            auxiliar=copy[j+1];
            copy[j+1]=copy[j];
            copy[j]=auxiliar;
        }
       }
      }
      esca=verificarConsecutividad(copy);
      return esca;
  }
  private int[] ordenar(int [] arre)
    {
        for(int k=0;k<4;k++){
            for (int f=0;f<4-k;f++){
                if(arre[f]>arre[f+1]){
                    int aux;
                    aux=arre[f];
                    arre[f]=arre[f+1];
                    arre[f+1]=aux;
                }
            }
        }
        return arre;
    }
  private  boolean full(int [] vect)
  {
      int []copy=ordenar(vect);
      boolean res;
        int pri=0;
        int seg=0;
        int tri=0;
        int aux=copy[0];
        for(int i=0;i<copy.length;i++)
        {
            if(aux==copy[i]){
                pri++;
            }else{
                aux=copy[i];
                for(int j=i;j<copy.length;j++){
                    
                    if(aux==copy[i]){
                        seg++;
                    }
                    else
                        tri++;
                }
            }
            
        }
        if(tri!=0){
                res = false;
        }
        else{
                if(pri==4){
                    if((seg==2)||(seg==3)){
                        res = true;
                    }
                    else
                        res = false;
                }
                else
                  res = false;
            }
        return res;
    }
  public boolean getFull()
  {
      return full;
  }
  private boolean grande(int []cop)//metodo que verifica si todos los dados son iguales
  {   boolean res = false;
      if(cop[0]==cop[1] && cop[0]==cop[2] && cop[0]==cop[3] && cop[0]==cop[4])
      {
          res=true;
      }
      return res;
  }
  public boolean getGrande()
  {
      return grande;
  }
 
  public boolean verificarConsecutividad(int []cop)//este metodo verifica si hay escalera
  {   boolean res=false;
      if(cop[0]==1 && cop[1] ==2 && cop[2]==3 && cop[3]==4 && cop[4]==5)
      { res=true;
      }
      if(cop[0]==1 && cop[1] ==3 && cop[2]==4 && cop[3]==5 && cop[4]==6)
      {res=true;
      }
      if(cop[0]==2 && cop[1] ==3 && cop[2]==4 && cop[3]==5 && cop[4]==6)
      {res=true;
      }
      return res;
  }
  
  public String balas(int [] vect)//metodo que cuenta los unos
  {   String res="";
      int cop[]=vect;//crea una copia del vector
      int cont=0;//inicializa un contador;
      for(int i=0;i<vect.length;i++)
      {if(cop[i]==1)
          {cont++;
          }
      }
      return res+Integer.toString(cont);
  }
  public String getBalas()
  {
      return balas;
  }
  private String tontos(int [] vect)//cuenta los dados con el numero dos
  {   
      String res2="";
      int cop[]=vect;//crea una copia del vector
      int cont=0;//inicializa un contador;
      for(int i=0;i<vect.length;i++)
      {if(cop[i]==2)
          {cont++;
          }
      }
       return res2+Integer.toString(cont*2);
      
  }
  public String getTontos()
  {
      return tontos;
  }
  private String trenes(int [] vect)
  {
      String res3= "";
      int cop[]=vect;//crea una copia del vector
      int cont=0;//inicializa un contador;
      for(int i=0;i<vect.length;i++)
      {if(cop[i]==3)
          {cont++;
          }
      }
      return res3+Integer.toString(cont*3);
  }
  public String getTrenes()
  {
      return trenes;
  }
  private String cuadras(int [] vect)//cuenta los dados con el numero 4
  {
      String res4="";
      int cop[]=vect;//crea una copia del vector
      int cont=0;//inicializa un contador;
      for(int i=0;i<vect.length;i++)
      {if(cop[i]==4)
          {cont++;
          }
      }
      return res4+Integer.toString(cont*4);
  }
  public String getCuadras()
  {
      return cuadras;
  }
  private String quinas(int []vect)//cuenta los dados con el numero cinco
  {
      String res5="";
      int cop[]=vect;//crea una copia del vector
      int cont=0;//inicializa un contador;
      for(int i=0;i<vect.length;i++)
      {if(cop[i]==5)
          {cont++;
          }
      }
      return res5+Integer.toString(cont*5);
  }
  public String getQuinas()
  {
      return quinas;
  }
  private String cenas(int [] vect)//cuenta los dados con el numero 6
  {
      String res6="";
      int cop[]=vect;//crea una copia del vector
      int cont=0;//inicializa un contador;
      for(int i=0;i<vect.length;i++)
      {if(cop[i]==6)
          {cont++;
          }
      }
      return res6+Integer.toString(cont*6);
  }
  public String getCenas()
  {
      return cenas;
  }

    private boolean poker(int[]arr)
     {
       int cont=0;
       boolean poker=false;
        
          int valor=arr[0];
          int valor1=arr[1];
          int cont2=0;
          
          for(int i=0;i<arr.length;i++)
          {
           if(valor==arr[i])
            cont++;
            else if(valor1==arr[i])
               cont2++; 
           
        }
         if(cont==4 || cont2==4)
         {  return true;
         
         }else{
                 return false;
              }
      }
    public boolean getPoker()
    {
        return poker;
    }
      public String[] getCajaN()
    { cajaN[0]=balas;
      cajaN[1]=tontos;
      cajaN[2]=trenes;
      cajaN[3]=cuadras;
      cajaN[4]=quinas;
      cajaN[5]=cenas;
      return cajaN;
    }
    public boolean[] getCajaE()
    { cajaE[0]=escalera;
      cajaE[1]=full;
      cajaE[2]=poker;
      cajaE[3]=grande;
      return cajaE;
    }
}
