/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package RelacionDeEjercicios3;


public class Ej47 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double notas[]= {6,3,9,7,5,8,10,2,4,5};
        double suma=0, media;
        for (int i = 0; i <=notas.length-1; i++) {
            suma+=notas[i];
        }
        media=Math.round(suma/notas.length);
        System.out.println("La media de las notas es de " +  media);
        
    }

}
