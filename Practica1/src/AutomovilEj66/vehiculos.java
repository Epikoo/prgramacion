package AutomovilEj66;

import java.util.Scanner;

public class vehiculos {

    public static void main(String[] args) {
        int arranque, L;
        String color;
        Scanner t = new Scanner(System.in);
        coche ferrari = new coche(4, 3, "rojo", 1.30, 50);
        System.out.println("---------------------Caracteristicas Ferrari-----------------------------");
        System.out.println("el coche tiene " + ferrari.ruedas + " ruedas");
        System.out.println("el coche tiene " + ferrari.puertas + " puertas");
        System.out.println("el coche es de color " + ferrari.color);
        System.out.println("el coche tiene una altura de " + ferrari.altura);
        do {

            do {
                System.out.println("¿Que desea hacer con el coche? (SALIR DEL COCHE=-1) (APAGAR=0) (ARRANCAR=1) (MOVER COCHE=2) (PINTAR =3) (MOSTRAR CARASTERISTICAS = 4) (REPOSTAR = 5)");     
                arranque = t.nextInt();
            } while (arranque != 0 && arranque != 1 && arranque != -1 && arranque!=2 && arranque!=3 && arranque!=4 &&arranque!=5);
           switch(arranque){
                case -1:
                   System.out.println("Saliendo del coche y cerrando la puerta...............");
                   break;
               case 0:
                  ferrari.apargar();
                   break;
              case 1:
                   ferrari.arrancar();
                   break;
               case 2:
                   ferrari.moverse();
                   break;
               case 3:
                    System.out.print(" DE QUE COLOR DESEA PINTAR EL COCHE  ");
                    color=t.next();
                     ferrari.pintar(color);
                     break;
               case 4:
                     System.out.println(ferrari);
                     break;
               case 5:
         
                   do {                       
                   System.out.println("BIENVENIDO AL SURTIDOR EL LADRON");
                   System.out.print("Introduzca la cantidad de Litros a repostar  ");
                   L=t.nextInt();
                       if (L+ ferrari.gasolina>50 || L+ferrari.gasolina<0) {
                           System.out.println("ERROR NO PUEDE ECHAR TANTOS LITROS");
                       }
                   } while (L+ ferrari.gasolina>50 || L+ferrari.gasolina<0);
                   ferrari.repostar(L);
           }
        } while (arranque != -1);
        
    }

}
