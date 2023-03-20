/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CondicionalesRepaso;

import java.util.Scanner;

public class zEJ12 {

    /**
     * @param args the command line arguments
     */
    public  void main(String[] args) {
        int eurostot, euromovil, b500, b200, b100, b50, b20, b10, b5, m2, m1;
        Scanner t = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de euros a desglosar ");
        eurostot = t.nextInt();
        euromovil = eurostot;
        //billetes 500
        b500 = euromovil / 500;
        euromovil %= 500;
        //billetes 200
        b200 = euromovil / 200;
        euromovil %= 200;
        //billetes 100
        b100 = euromovil / 100;
        euromovil %= 100;
        //billetes 50
        b50 = euromovil / 50;
        euromovil %= 50;
        //billetes 20
        b20 = euromovil / 20;
        euromovil %= 20;
        //billetes 10
        b10 = euromovil / 10;
        euromovil %= 10;
        //billetes 5
        b5 = euromovil / 5;
        euromovil %= 5;
        //monedas2
        m2 = euromovil / 2;
        euromovil %= 2;
        //monedas1
        m1 = euromovil;
        System.out.println("Hay " + b500 + " billetes de 500€ en la cantidad de: " + eurostot);
        System.out.println("Hay " + b200 + " billetes de 200€ en la cantidad de: " + eurostot);
        System.out.println("Hay " + b100 + " billetes de 100€ en la cantidad de: " + eurostot);
        System.out.println("Hay " + b50 + " billetes de 50€ en la cantidad de: " + eurostot);
        System.out.println("Hay " + b20 + " billetes de 20€ en la cantidad de: " + eurostot);
        System.out.println("Hay " + b10 + " billetes de 10€ en la cantidad de: " + eurostot);
        System.out.println("Hay " + b5 + " billetes de 5€ en la cantidad de: " + eurostot);
        System.out.println("Hay " + m2 + " monedas de 2€ en la cantidad de: " + eurostot);
        System.out.println("Hay " + m1 + " monedas de 1€ en la cantidad de: " + eurostot);
    }

}
