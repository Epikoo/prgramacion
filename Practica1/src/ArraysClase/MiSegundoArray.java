/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ArraysClase;

import java.util.Scanner;

public class MiSegundoArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner t=new Scanner(System.in);
      int num[], ale, aux;
      num=new int[10];
        for (int i = 0; i <= num.length-1; i++) {
            ale=(int)((Math.random()*(23-10+1))+10);
            num[i]=ale;
            System.out.println(num[i] + " , ");
        }
        aux=num[0];
        num[0]=num[num.length-1];
        num[9]=aux;
        System.out.print("El array en horizontal es:   ");
        for (int i = 0; i <=num.length-1; i++) {
            System.out.print( " " +num[i] );
        }
    }

}
