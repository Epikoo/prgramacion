/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CondicionalesRepaso;

import java.util.Scanner;

public class EJ7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int ano, mes;
        System.out.println("Introduzca el mes a examinar ");
        mes = t.nextInt();
        System.out.println("Introduzca el ano a examinar ");
        ano = t.nextInt();
        t.close();
        boolean bisiesto = ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0;
        if (mes > 0 && mes < 13) {
            if (mes % 2 != 0) {
                System.out.println("El mes tiene 31 dias");
            } else {
                if (mes == 2) {
                    if (bisiesto) {
                        System.out.println("El mes tiene 29 dias ");
                    } else {
                        System.out.println("El mes tiene 28 dias ");
                    }
                } else {
                    System.out.println("El mes tiene 30 dias");
                }
            }
        } else {
                System.out.println("ERROR LOS ANOS TIENEN DE 1-12 MESES");
        }
        
    }

}


