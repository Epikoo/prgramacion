package ej76;

public class testUrna {

    public static void main(String[] args) {
        int vueltas=1;
        Urna u1 = new Urna((int) (Math.random() * 10 + 1), (int) (Math.random() * 10 + 1));
        System.out.println(u1);
        while (u1.comprobarBolas() > 1) {
            System.out.println("------------Ronda: " + vueltas + "----------------");
              vueltas++;  
            char b1 = u1.extrarBola();
            System.out.println("Se ha extraido una bola " + b1);
            char b2 = u1.extrarBola();
            System.out.println("Se ha extraido una bola " + b2);
            if (b1 == b2) {
                u1.introducir('b');
                System.out.println("Se ha introducido una bola blanca");
            } else {
                u1.introducir('n');
                System.out.println("Se ha introducido una bola negra");
            }
            System.out.println( "Se ha extraido la bola final de color" + u1);
        }
        System.out.println(u1.extrarBola() + "");
        System.out.println(u1);
    }

}
