/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package CondicionalesRepaso;

import java.util.Scanner;


public class EJ3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2;
        Scanner t=new Scanner(System.in);
        System.out.println("Introduzca el primer valor ");
        num1=t.nextInt();
        System.out.println("Introduzca el segundo valor ");
        num2=t.nextInt();
        if (num1>num2) {
            System.out.println("El primero es mayor la suma de los dos es " + (num1+num2) + " y la division es " + (num1/num2));
        }else{
            System.out.println("El segundo es mayor la resta de los dos es " + (num2-num1) + " y la multiplicacion es : " + (num1*num2));
        }
    }

}
