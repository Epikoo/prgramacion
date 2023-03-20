/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CondicionalesRepaso;

import java.util.Scanner;

public class zEJ10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        final String NICK = "ALBERTO", PASS = "AlBeRtoChUlO", EMAIL = "alberto@sir.com";
        String nombre, mail, contra;
        int ale,aleatorio = (int) ((Math.random() * (9999 - 1000 + 1)) + 1000);
        System.out.println("Introduzca su NICK");
        nombre = t.nextLine();
        System.out.println("Introduzca su contraseña");
        contra = t.nextLine();
        System.out.println("Introduzca su E-Mail");
        mail = t.nextLine();
        if (NICK.equals(nombre) && PASS.equals(contra) && EMAIL.equalsIgnoreCase(mail)) {
            System.out.println("Su codigo de acceso de 4 cifras es : " + aleatorio);
            System.out.println("Introduzca su E-Mail");
            mail = t.nextLine();
             System.out.println("Introduzca su contraseña");
            contra = t.nextLine();
             System.out.println("Introduzca su numero de acceso en dos pasos");
             ale = t.nextInt();
             if (aleatorio==ale && PASS.equals(contra) && EMAIL.equalsIgnoreCase(mail)) {
                 System.out.println("Bienvenid@ " + NICK);
             }else{
                 System.out.println("Error de acceso algunos de los campos no coinciden");
             }
        } else {
            System.out.println("Error de acceso algunos de los campos no coinciden");
        }
        t.close();
    }

}
