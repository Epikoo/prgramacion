/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package CondicionalesRepaso;

import java.util.Scanner;


public class EJ5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, num3,mayor, menor;
        Scanner t=new Scanner(System.in);
        System.out.println("Introduzca el primer valor ");
        num1=t.nextInt();
        mayor=num1;
        menor=num1;
        System.out.println("Introduzca el segundo valor ");
        num2=t.nextInt();
        if (num2>mayor) {
            mayor=num2;
        }else if (num2<menor) {
            menor=num2;
        }
        System.out.println("Introduzca el tercer valor ");
        num3=t.nextInt();
         if (num3>mayor) {
            mayor=num3;
        }else if (num3<menor) {
            menor=num3;
        }
        if (num1<0 && num2<0 && num3<0) {
            System.out.println("Los tres numeros son : " + num1 + num2 + num3);
            System.out.println("El mayor de los numeros es: " +mayor);
            System.out.println("El menor de los numeros es: " +menor);
        }else{
            System.out.println("Los numeros han de ser negativos para el funcionamiento");
        }
   
        
    }

}
