package Excepciones.ej110;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TryPiscina {

    public static void main(String[] args) {

        Piscina p1 = new Piscina((int) (Math.random() * 100 + 1));
        for (int i = 0; i < 5; i++) {
            try {
                p1.ponerAgua((int) (Math.random() * 25 + 1));
                System.out.println("HAY "  + p1.getNivel() + " L de agua de " + p1.MAXNIVEL);
            } catch (Exception e) {
                System.out.println("No entra mas agua");
            }
        }
        for (int i = 0; i < 5; i++) {
            try {
                p1.quitarAgua((int) (Math.random() * 25 + 1));
               System.out.println("QUEDAN "  + p1.getNivel() + " L de agua de " +p1.MAXNIVEL);
            } catch (Exception e) {
                System.out.println("No hay esa cantidad de agua");
            }
        }
    }
}
