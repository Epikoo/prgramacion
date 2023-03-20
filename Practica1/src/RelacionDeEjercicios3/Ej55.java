/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package RelacionDeEjercicios3;

import java.util.Scanner;


public class Ej55 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        int k=0, reps=1, mayor=0, array[]=new int[10];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Introduzca el valor " + (i+1) + " ");
            array[i]=t.nextInt();
            //guardamos el mayor cuando recorremos el array con el metodo candidato y guardamos las repeticiones con el contador reps;
            if (mayor<=array[i]) {
                if (array[i]==mayor) {
                    reps++;
                }else{
                    reps=1;
                }
                mayor=array[i];
            }
            
        }
        //creamos el array de las posiciones con un tamaño de las repeticiones del mayor y asi podemos almacener las posiciones donde se repite en el array principal.
        int nuevo[]=new int[reps];
        for (int i = 0; i < array.length; i++) {
            if(array[i]==mayor){
               nuevo[k]=i;
               k++;
            }
        }
       //imprimimos el array 1
       for (int i = 0; i < array.length; i++) {
            if (i<array.length-1) {
                System.out.print(array[i]+ " , ");
            }else{
                System.out.print(array[i]);
            }
       }
        System.out.println(" ");
       //imprimimos el numero de repeticiones y el mayor
        System.out.println("El numero mas grande de nuestro array es " + mayor + " y se repite una cantidad de " + reps);
        //imprimimos el segundo array con las posiciones donde se repite el mayor
          for (int i = 0; i < nuevo.length; i++) {
            if (i<nuevo.length-1) {
                System.out.print((nuevo[i] +1)+ " , ");
            }else{
                System.out.print((nuevo[i] + 1));
            }
          }
    }

}
