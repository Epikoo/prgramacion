/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package RelacionDeEjercicios3;

import java.util.Scanner;


public class Ej51 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String color[]=new String[10];
        int rojo=0, azul=0, raro=0;
        Scanner t=new Scanner(System.in);
        for (int i = 0; i < color.length; i++) {
            System.out.println("Introduzca el color a almacenar " + (i+1));
            color[i]=t.nextLine();
            if (color[i].equalsIgnoreCase("Rojo")) {
                rojo++;
            }else if (color[i].equalsIgnoreCase("Azul")) {
                azul++;
            }else{
                raro++;
            }
        }
        System.out.println("El numero de veces que se repite rojo es " +  rojo);
        System.out.println("El numero de veces que se repite azul es " +  azul);
        System.out.println("Hay " + raro + " casos donde no se introduce un color o es distinto a azul o rojo");
    }

}
