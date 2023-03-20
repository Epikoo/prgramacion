/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ArraysClase;

import java.util.Scanner;

public class MiPrimerArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int tamaño, notas[], suma = 0, media;
        do{
        System.out.println("Introduzca la dimension del array");
        tamaño = t.nextInt();
        }while(tamaño<0);
        notas = new int[tamaño];
        for (int i = 0; i <= notas.length - 1; i++) {
            do {
                System.out.println("Introduzca la nota  " + (i+1) + " del array");
                notas[i] = t.nextInt();
            } while (notas[i] < 0 || notas[i] > 10);

            suma += notas[i];
        }
        media = suma / notas.length;
        System.out.println("La suma es de " + suma);
        System.out.println("La media es de " + media);
    }

}
