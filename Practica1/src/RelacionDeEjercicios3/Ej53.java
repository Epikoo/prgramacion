/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package RelacionDeEjercicios3;


public class Ej53 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int valores[] = {2,4,6,8,1,3,5,7}; 
        int nueva[]=new int[(valores.length+2)];
        //primero copiaremos el array y desplazaremos las posiciones para dejar 4, y 7 libre
        for (int i = 0; i < nueva.length; i++) {
            if (i<4) {
                nueva[i]=valores[i]; 
            }else if (i==4) {
                nueva[i]=200;
            }else if (i<7) {
                nueva[i]=valores[i-1];
            }else if (i==7) {
                nueva[i]=300;
            }else{
                nueva[i]=valores[i-2];
            }
        }
        //imprimimos el primer array 
        for (int i = 0; i < valores.length; i++) {
            if (i<valores.length-1) {
                System.out.print(valores[i]+ " , ");
            }else{
                System.out.print(valores[i]);
            }
        }
        System.out.println("");
          //imprimimos el nuevo array
        for (int i = 0; i < nueva.length; i++) {
            if (i<nueva.length-1) {
                System.out.print(nueva[i]+ " , ");
            }else{
                System.out.print(nueva[i]);
            }
        }
    }

}
