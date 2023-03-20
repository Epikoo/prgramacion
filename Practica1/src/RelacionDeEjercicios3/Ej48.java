/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package RelacionDeEjercicios3;


public class Ej48 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int flags[]={0,1,0,-1,0,-1,-1,-1,0,0,-1};
        int tivic[]=new int[flags.length];
        System.arraycopy(flags, 0, tivic, 0, flags.length);
         /* for (int i = 0; i < flags.length; i++) {
            tivic[i]=flags[i];
        }*/
        for (int i = 0; i < tivic.length; i++) {
            if (flags[i]==-1) {
                flags[i]=8;
            }
        }
       for (int i = 0; i < tivic.length; i++) {
           
           if (i<tivic.length-1) {
               System.out.print(flags[i] + " ");
           }else{
               System.out.println(flags[i]);
           }
       }
    }

}
