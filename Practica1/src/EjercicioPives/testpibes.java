
package EjercicioPives;

public class testpibes {
    public static void main(String[] args){
        Pibe morales=new Pibe("RAÚL");
        System.out.println(morales);
        System.out.println("Hago cositas...");
        morales.jugar();
        morales.comunicarse();
        morales.comer();
        System.out.println("MATEMOS A RAUL");
        for (int i = 0; i < 100; i++) {
            morales.jugar();
        }
    }

}
