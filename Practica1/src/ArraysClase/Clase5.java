package ArraysClase;

import java.util.Scanner;

public class Clase5 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int num[], segunda[], valor, k = 0;
        num = new int[100];
        for (int i = 0; i <= num.length - 1; i++) {
            num[i] = (int) (Math.random() * 100 + 1);
        }
        do {
            System.out.println("Introduzca por teclado un valor");
            valor = t.nextInt();
        } while (valor < 1 || valor > 100);
        
        segunda = new int[valor];
        for (int i =num.length-valor; i <= num.length - 1; i++) {
           segunda[k]=num[i];
            k++;

        }
        for (int i = 0; i <= num.length - 1; i++) {
            System.out.println(segunda[k] + " ");
        }
    }
}
