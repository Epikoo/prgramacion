/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package CondicionalesRepaso;

import java.util.Scanner;


public class EJ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double nota1, nota2, nota3, media;
        Scanner t=new Scanner(System.in);
        System.out.println("Introduzca nota 1");
        nota1=t.nextDouble();
        System.out.println("Introduzca nota 2");
        nota2=t.nextDouble();
        System.out.println("Introduzca nota 3");
        nota3=t.nextDouble();
        media=(nota1 + nota2 + nota3)/3;
        if (media<6.5) {
            System.out.println("No promociona con una media de: " + media);
        }else{
            System.out.println("Promociona con una media de: " + media);
        }
        
    }

}
