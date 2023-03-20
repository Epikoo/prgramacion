/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package RelacionDeEjercicios3;

import java.util.Scanner;


public class Ej54 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        int num, valores[] = {2,4,6,8,1,3,5,7}, posi=0;
        boolean esta=false;
        do{
            System.out.println("Introduzca un valor para comprobar en los datos\n si quiere apagar escriba el valor 888");
            num=t.nextInt();
            for (int i = 0; i < valores.length; i++) {
                if (valores[i]==num) {
                   esta=true;
                   posi=i+1;
                }
            }
            if (esta) {
                 System.out.println(" El numero se encuentra en el array en la posicion " +  posi);
            }else if (num==888) {
                
            }else{
                System.out.println("El numero no se encuentra en el array");
            }
            esta=false;
           
        }while (num!=888);  
            
        
    }

}
