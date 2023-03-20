
package ejAgregacionGuerrero;

public class testGuerrero {
    public static void main(String[] args){
        Arma garrote=new Arma("Garrote", 10, 20);
        Arma pinchos =new Arma("pinchotes", 21, 13);
        Guerrero guerrero1=new Guerrero("NAMI", 100, 50,100,  pinchos);
        Guerrero guerrero2=new Guerrero("Luffy", 20, 10, 100, garrote);
    }

}
