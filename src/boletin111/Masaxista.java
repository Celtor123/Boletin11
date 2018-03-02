
package boletin111;

public class Masaxista extends Seleccion{
    
    int anosExperiencia;
    String titulacion;


    public Masaxista( int id, int edade, String nome, String apelido, int anosExperiencia, String titulacion) {
        super(id, edade, nome, apelido);
        this.anosExperiencia = anosExperiencia;
        this.titulacion = titulacion;
    }
    
    @Override
    void concentrarse(){  
    }
    @Override
    void viaxar(){
        System.out.println("viaxa o masaxista");
    }
    void darMasaxes(){
    }   
    @Override
    public String toString() {
        return ("Masaxista:\n"+super.toString()+"\nanosdeExperiencia: "+anosExperiencia+"\nTitulacion: "+titulacion+"\n");
    }
}



//A clase masaxista ten os seguintes : 
//
//*   atributos : id (int ), nome ( String), apelido ( String ),edade (int ), titulacion (String),     anosExperiencia (int )
//*   métodos : concentrarse () : void 
//                      viaxar ( ) : void
//                      darMasaxes ( ) : void