/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package CondicionalesRepaso;

import java.util.Scanner;


public class EJ2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        String clave1, clave2;
        System.out.println("Introduzca una clave: ");
        clave1=t.nextLine();
        System.out.println("Introduzca la clave de nuevo: ");
        clave2=t.nextLine();
        if (clave1.equals(clave2)) {
            System.out.println("Las dos claves son iguales");
        }else{
            System.out.println("Las dos claves no son iguales");
        }
    }

}
