/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package CondicionalesRepaso;

import java.util.Scanner;


public class EJ9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        Scanner t=new Scanner(System.in);
        System.out.println("Introduzca el numero a estudiar");
        numero=t.nextInt();
        if ((numero>9999 && numero<=99999)&& numero%2==0) {
            System.out.println("El numero es par y de 5 cifras");
        }else{
            System.out.println("El numero no es par o de 5 cifras");
        }
    }

}
