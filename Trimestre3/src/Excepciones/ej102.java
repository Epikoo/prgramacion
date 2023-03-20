
package Excepciones;

import java.util.Scanner;

public class ej102 {
    public static void main(String[] args){
        Scanner t=new Scanner(System.in);
        System.out.println("Introduzca un texto");
        String cadena=t.next();
        System.out.println("Introduzca una posicion a checkear");
        int num=t.nextInt();
        try {
            System.out.println(cadena.charAt(num));
        } catch (Exception e) {
            System.out.println("No existe la posicion N en la cadena " + e.getMessage());
        }
    }

}
