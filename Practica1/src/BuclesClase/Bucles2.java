/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BuclesClase;

import java.util.Scanner;

public class Bucles2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        Scanner t = new Scanner(System.in);
        do {
            System.out.println("Introduzca el numero o el boton 0 para salir");
            num = t.nextInt();
            if (num < 0 || num > 100) {
                System.out.println("ERROR EL NUMERO DEBE ESTAR COMPRENDIDO ENTRE 1 y 100");
            } else {
                if (num % 3 == 0 && num % 5 == 0) {
                    System.out.println("FIZZ - BUZZ");
                } else if (num % 3 == 0) {
                    System.out.println("FIZZ");
                } else if (num % 5 == 0) {
                    System.out.println("BUZZ");
                }else{
                    System.out.println("El numero no es FIZZ BUZZ");
                }
                if (num %10 ==0 ) {
                    System.out.println();
                }
                
            }
        } while (num !=0);

    }
}
