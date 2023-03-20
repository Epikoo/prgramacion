/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package RelacionDeEjercicios3;


public class Ej57 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int aux, lista[]=new int[10];
        //cargamos el array aleatorio de dimension 10 y lo imprimimos
        for (int i = 0; i < lista.length; i++) {
            lista[i]=(int)((Math.random()*99)+1);
            if (i<lista.length-1) {
                System.out.print(lista[i] + " , ");
            }else{
            System.out.println(lista[i]);
            }
        }
        //ordenacion del array de menor a mayor
        for (int i = 0; i < lista.length; i++){
            for (int j = i+1; j < lista.length; j++) {
                if (lista[i]>lista[j]) {
                    aux=lista[i];
                    lista[i]=lista[j];
                    lista[j]=aux;
                }
            }
        }
        //imprimimos el array ordenado de menor a mayor
         for (int i = 0; i < lista.length; i++) {
            if (i<lista.length-1) {
                System.out.print((lista[i])+ " , ");
            }else{
                System.out.print((lista[i]));
            }
         }
    }

}
