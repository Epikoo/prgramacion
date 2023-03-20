/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CondicionalesRepaso;

import java.util.Scanner;

public class zEJ11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int num, p, oo, c;
        System.out.println("Introduzca el numero a estudiar");
        num = t.nextInt();
        p = (num % 10000) / 1000;
        oo = (num % 1000) / 10;
        c = num % 10;
        boolean cond1 = num > 999 && num <= 9999, cond2 = p >= 1 && p <= 8, cond3 = c == oo % p;
        System.out.println("P : " + p + " /  O : " + oo + " /  C : " + c);
        if (cond1 && cond2 && cond3) {
            System.out.println("El numero corresponde a un numero correcto");
        } else {
            System.out.println("El numero corresponde a un numero incorrecto");
        }
        t.close();
    }

}
