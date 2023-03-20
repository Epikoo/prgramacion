/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package RelacionDeEjercicios3;


public class Ej49 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int mayor=0, menor=123123123, lista[]=new int[100];
        for (int i = 0; i < lista.length; i++) {
            lista[i]=(int)((Math.random()*100)+1);
            if (mayor<lista[i]) {
                mayor=lista[i];
            }
            if (menor>lista[i]) {
                menor=lista[i];
            }
            if (i<lista.length-1){
                System.out.print( lista[i]+" , ");
            }else{
                System.out.println(lista[i]);
            }
        }
        System.out.println("El mayor del array es " + mayor + " \n El menor del array es " + menor);
    }

}
