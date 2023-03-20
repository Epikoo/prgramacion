/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package RelacionDeEjercicios3;

import java.util.Scanner;


public class Ej50 {

    public static void main(String[] args) {
        int prueba[]=new int[100];
        int mayor=0, posi=0, reps=0;
        //carga de datos aleatorios 
        for (int i = 0; i < prueba.length; i++) {
            prueba[i]=(int)(Math.random()*99)+1;
            if (i<prueba.length-1) {
                System.out.print(prueba[i] + " , ");
            }else{
                System.out.println(prueba[i]);
            }
        }
        //recorremos el array para encontrar los múltiplos de 5 (x%5=0)
        System.out.println("Los multiplos de 5 son :");
        for (int i = 0; i < prueba.length; i++) {
            if (prueba[i]%5==0) {
                System.out.print(prueba[i] + " ");
            }
        }
        System.out.println("");
        //recorremos el array para encontrar los pares.
        System.out.println("Los numeros pares del array son: ");
        for (int i = 0; i < prueba.length; i++) {
            if (prueba[i]%2==0) {
                System.out.print(prueba[i] + " ");
            }
        }
         // guardando el candidato a mayor y la primera vez que se da, así como sus repeticiones.
        for (int i = 0; i < prueba.length; i++) {
        if (prueba[i]>mayor) {
                if (prueba[i]!=mayor) {
                 posi=i+1;
            }
                mayor=prueba[i];
            }
            if (prueba[i]==mayor) {
                reps++;
                
            }
          }
        System.out.println("");
        System.out.println("El mayor de los valores es " + mayor + " y sale en la posicion " + posi + " y se repite " +reps );
    }

}
