/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CondicionalesRepaso;

import java.util.Scanner;

public class EJ4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, num3, num4, num5, mayor = 0, menor = 0;
        Scanner t = new Scanner(System.in);
        System.out.println("Introduzca el numero 1");
        num1 = t.nextInt();
        mayor = num1;
        menor = num1;
        //numero 2
        System.out.println("Introduzca el numero 2");
        num2 = t.nextInt();
        if (num2 > mayor) {
            mayor = num2;
        } else if (num2 < menor) {
            menor = num2;
        }
        //numero 3
        System.out.println("Introduzca el numero 3");
        num3 = t.nextInt();
        if (num3 > mayor) {
            mayor= num3;
        } else if (num3 < menor) {
             menor= num3;
        }
          //numero 4
        System.out.println("Introduzca el numero 4");
        num4 = t.nextInt();
        if (num4 > mayor) {
            mayor = num4;
        } else if (num4 < menor) {
             menor= num4;
        }  
         //numero 5
        System.out.println("Introduzca el numero 5");
        num5 = t.nextInt();
        if (num5 > mayor) {
            mayor = num5;
        } else if (num5 < menor) {
             menor= num5;
        }
        System.out.println("El numero mayor es :" + mayor);
        System.out.println("El numero mayor es :" + menor);
        }

    }
