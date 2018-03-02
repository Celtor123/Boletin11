
package boletin111;


public class Adestrador extends Seleccion{
     
    private int idFederacion;

    public Adestrador(int id, int edade, String nome, String apelido,int idFederacion) {
        super(id, edade, nome, apelido);
        this.idFederacion = idFederacion;
    }

    

   

    
    
    @Override
    void viaxar(){
        System.out.println("viaxa o seleccionador");
    }
    @Override
    void concentrarse(){
        
    }   
    void dirixirPartido(){
        
    }
    void dirixirAdestramento(){
        
    }
    @Override
    public String toString() {
        return ("Adestrador:\n"+super.toString()+"\nFederacion: "+idFederacion+"\n");
    }
}


//A clase Adestrador ten os serguintes :
//  *  atributos : id (int ), nome ( String), apelido ( String ),edade (int ), idFederacion ( String )
//  *  métodos : concentrarse () : void 
//                      viaxar ( ) : void
//                      dirixirPartido ( ) : void
//                      dirixirAdestramento ( ) : void
