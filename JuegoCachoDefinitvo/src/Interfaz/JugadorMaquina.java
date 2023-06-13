/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

public class JugadorMaquina extends Jugador
{
    
    public JugadorMaquina(String n, int pun, int rach)
    {
        super(n,pun,rach);
    }
     public int decidirJugada(boolean cE[],String cN[])
    {
        int res;
        if(cE[3]==true && (registro[9]==false || registro[10]==false))
        {
          res=9;   
        }
        else
        {if(cE[2]==true && registro[8]==false)
         {
          res=8;   
         }
         else
         {if(cE[1]==true && registro[7]==false )
          {
           res=7;   
          }
          else
          {if(cE[0]==true && registro[6]==false)
           {
             res=6;   
           }
           else
           {
             if(!cN[0].equals("0") && registro[0]==false )
             {
              res=0;   
             }
             else
             {if(!cN[1].equals("0") && registro[1]==false)
              {
                res=1;   
              }
              else
              {if(!cN[2].equals("0") && registro[2]==false)
               {
                res=2;   
               }
               else
               {if(!cN[3].equals("0") && registro[3]==false)
                {
                 res=3;   
                }
                else
                {if(!cN[4].equals("0") && registro[4]==false)
                 {
                   res=4;   
                 }
                 else
                  {if(!cN[5].equals("0") && registro[5]==false)
                   {
                     res=5;   
                   }
                   else
                   {if(registro[9]==false || registro[10]==false )
                     {res=19;
                     }
                     else
                     {if(registro[8]==false )
                     { res=18;
                     }
                     else
                     {if(registro[7] ==false)
                      { res=17;
                      }
                       else
                      {if(registro[6] ==false)
                       { res=16;
                       }
                       else
                       {if(registro[0] ==false)
                        { res=10;
                        }
                        else
                        {if(registro[1] ==false)
                         { res=11;
                         }
                          else
                         {if(registro[2] ==false)
                          { res=12;
                          }
                          else
                          {if(registro[3] ==false)
                           { res=13;
                           }
                           else
                           {if(registro[4] ==false)
                            { res=14;
                            }
                            else
                            { 
                              res=15;
                            }
                           }
                          }
                         }
                        }
                       }
                      }
                     }
                     }
                   }
                }
                }
               }
              }
             }
           }
          }
         }
        }
        return res;
    }
}
