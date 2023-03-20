/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package BuclesClase;

import java.util.Scanner;

public class Bucles1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner t=new Scanner(System.in);
      int base=-1, exponente=-1, res=1 ;
    
     while(base<0 || exponente<0){
         System.out.println("Introduzca la base");
         base=t.nextInt();
         System.out.println("Introduzca el exponente");
         exponente=t.nextInt();
         if (base<0 || exponente<0) {
             System.out.println("Error los numeros son positivos");
         }else{
             for(int i=0; i<exponente; i++){
                 res*=base;
             }
         }
         System.out.println(res);
     }
             
             
              
    }

}
