/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package CondicionalesRepaso;

import java.util.Scanner;


public class EJ8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        String name1, name2;
        int dado1, dado2;
        System.out.println("Introduzca el nombre del primer jugador");
        name1=t.nextLine();
        System.out.println("Introduzca el nombre del segundo jugador");
        name2=t.nextLine();
        t.close();
        dado1=(int)(Math.random()*(6-1-1)+1);
        System.out.println(name1 + " Saco un " + dado1);
        dado2=(int)(Math.random()*(6-1-1)+1);
        System.out.println(name2 + " Saco un " + dado2);
        if (dado1>dado2) {
            System.out.println(name1 + " Gana la partida con un lanzamiento de " + dado1);
        }else if (dado1==dado2) {
            System.out.println("Empate a  " + dado1);
        }else{
            System.out.println(name2 + " Gana la partida con un lanzamiento de " + dado2);
        }
    }

}
