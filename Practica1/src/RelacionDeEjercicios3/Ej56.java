/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RelacionDeEjercicios3;

import java.util.Scanner;

public class Ej56 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int lista[] = new int[5];
        int sumatotal=0, lista2[] = new int[5];
        //carga datos
        for (int i = 0; i < lista.length; i++) {
            lista[i] = (int) ((Math.random() * (50 - 2) + 1) + 2);
            System.out.println("Introduzca el primer valor del array ");
            lista2[i] = t.nextInt();
        }
        //imprimimos 1er array
        System.out.print("El array aleatorio es : ");
        for (int i = 0; i < lista.length; i++) {
            if (i<lista.length-1) {
                System.out.print(lista[i] + " , ");
            }else{
                System.out.println(lista[i]);
            }
        }
        //imprimimos el 2o array
         System.out.print("El segundo array es : ");
        for (int i = 0; i < lista2.length; i++) {
            if (i<lista2.length-1) {
                System.out.print(lista2[i] + " , ");
            }else{
                System.out.println(lista2[i]);
            }
        }
        //creamos un 3 array como array sumatorio y lo imprimimos aprovechamos para ir haciendo el sumatorio
        int suma[]=new int[lista.length];
        for (int i = 0; i < suma.length; i++) {
            suma[i]=lista[i]+lista2[i];
            sumatotal+=suma[i];
             if (i<suma.length-1) {
                System.out.print(suma[i] + " , ");
            }else{
                System.out.println(suma[i]);
            }
        }
        System.out.println("La suma de todo sumado es de " + sumatotal);
        

    }

}
