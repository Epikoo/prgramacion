/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package RelacionDeEjercicios3;

import java.util.Scanner;


public class Ej52 {

    
    
        public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        boolean iguales=true;
        int arra1[], arra2[];
        arra1=new int[10];
        arra2=new int[10];
        //realizamos la carga de datos en arra1
        for (int i = 0; i < arra1.length; i++) {
            System.out.println("Introduzca el valor " + (i+1));
            arra1[i]=t.nextInt();
        }
        //realizamos la carga de datos en arra1
        for (int i = 0; i < arra2.length; i++) {
            System.out.println("Introduzca el valor " + (i+1));
            arra2[i]=t.nextInt();
        }
        //comprobacion de igualdad de arrays.
        for (int i = 0; i < arra1.length; i++) {
            if (arra1[i]!=arra2[i]) {
                System.out.println("Error el array no es igual a partir de la posicion  " + (i+1));
                 i+=11;
                iguales=false;
            }
        }
        if (iguales) {
            System.out.println("Los arrays son iguales");
        }
    }
    

}
