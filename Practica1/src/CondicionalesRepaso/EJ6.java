/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package CondicionalesRepaso;

import java.util.Scanner;


public class EJ6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int ano;
        Scanner t=new Scanner(System.in);
        System.out.println("Introduzca el ano a examinar ");
        ano=t.nextInt();
        if (ano%4==0 && ano%100!=0 || ano%400==0) {
            System.out.println("El año es bisiesto");
        }else{
            System.out.println("El año no es bisiesto");
        }
    }

}
