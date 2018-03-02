
package boletin111;

public class Xogador  extends Seleccion{
  int dorsal;
  String demarcacion;

  

    public Xogador(int id, int edade, String nome, String apelido,int dorsal, String demarcacion) {
        super(id, edade, nome, apelido);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }
  
   @Override
   void concentrarse(){
   }
   @Override
   void viaxar(){
       System.out.println("viaxan os xogadores");
   }
   void xogarPartido(){
   }
   void entrenar(){
   }

    @Override
    public String toString() {
        return ("Xogador:\n"+super.toString()+"\nDorsal: "+dorsal+"\nDemarcacion: "+demarcacion+"\n");
    }

   
}


// A clase Xogador ten os seguintes : 
//   *  atributos : id (int ), nome ( String), apelido ( String ),edade (int ), dorsal ( int ), demarcación                  
//                   ( String ).
//   *  métodos : concentrarse () : void 
//                        viaxar ( ) : void
//                        xogarPartido ( ) : void
//                        entrenar ( ) : void
//
