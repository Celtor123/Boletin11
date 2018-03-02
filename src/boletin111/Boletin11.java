
package boletin111;


public class Boletin11 {   

    public static void main(String[] args) {
        Seleccion España = new Seleccion(342397,22,"Marcos","Suarez Caparrós");
        Seleccion xog1= new Xogador(687201,28,"Julian","Pérez",1,"portero");
        Seleccion Masx1= new Masaxista(118394,50,"Goncho","Lez",30,"Licencado");
        Seleccion Adestra1=new Adestrador(000001,68,"Felipe","Rey",034);
        System.out.print(España.toString());
        System.out.print(xog1.toString());
        System.out.print(Masx1.toString());
        System.out.print(Adestra1.toString());
        España.concentrarse();
        xog1.concentrarse();
        Masx1.concentrarse();
        Adestra1.concentrarse();
        España.viaxar();
        xog1.viaxar();
        Masx1.viaxar();
        Adestra1.viaxar();
        System.out.println(xog1.getNome());
        System.out.println(España.getEdade());
        System.out.println(Masx1.getId());
        System.out.println(Adestra1.getApelido());
    }
    
}// respuesta: se puede llamar a una subclase a través del metodo de una superclase, pero no viceversa

//Crear un proxecto que simule o comportamento dunha selección de futbol .
//Para iso definir 3 clases que representan a obxectos xogador, adestrador e masaxista .

//1- Realiza un diagrama de clases que reflicta a xerarquia de clases deste proxecto
//
//2- En cada clase debes definir o constructor con parámetros , os métodos de acceso 
//e sobreescribir o método toString da superclase .
//
//3- O metodo concentrarse visualizará a mensaxe “ concentrase a selección “
//
//4- O método viaxar ,da superclase , visualizara a mensaxe “ viaxa a selección “. 
//Cada subclase sobreescribe éste método ca mensaxe “ viaxan os xogadores …...”.
//5- Define a clase Boletin 11 cas seguintes sentencias :   
//     * instancia un obxecto de cada clase 
//     * instancia un xogador de tipo Seleccion
//     * chama ao método concentrarse a través de cada obxecto. ¿ Que observas ?.
//     * Invoca ao método viaxar a través de cada obxecto. ¿ Cal é a saida ?
//     * ¿ Podes invocar a un método da superclase con un obxecto dunha subclase ?.Comprobao
//     * ¿ Podes invocar a un método da subclase con un obxecto do tipo da superclase ? .Comprobao