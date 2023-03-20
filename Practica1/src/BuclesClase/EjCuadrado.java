/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BuclesClase;

import java.util.Scanner;

public class EjCuadrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int num, aleatorio, retiradahumano, retiradamaquina;
        boolean primermaquina=false, primerhumano=false,  fin =false;;
      do {
            System.out.println("Introduzca un numero entero (no 0) que será el numero de bolas a jugar  ");
            num = t.nextInt();
        } while (num <= 0);
        aleatorio=(int)((Math.random()*2));
        System.out.println(aleatorio);
        if (aleatorio==0) {
            System.out.println("Empieza la maquina");
        }else{
            System.out.println("Empieza el humano");
            primerhumano=true;
        }
        while (!fin) {    
             while (primerhumano) {                
                 do {                     
                      System.out.println("Elija un numero de bolas a retirar entre uno, dos y tres");
                        retiradahumano=t.nextInt();
                 } while (retiradahumano<1 || retiradahumano>3);
                 num-=retiradahumano;
                 System.out.println("El numero de bolas es  :" + num);
                 if (num<=0) {
                     System.out.println("Has perdido");
                     fin =true;
                     
                 }
                 System.out.println("Turno de la maquina.................");
                 retiradamaquina=(int)((Math.random()*2)+1);
                 num-=retiradamaquina;
                 System.out.println("La maquina retira ........" + retiradamaquina);
                 System.out.println("El numero de bolas es" + num);
                 if (num<=0) {
                     System.out.println("Has ganado.");
                     fin =true;
                 }
            }
             
        }
       
        }
    

}
