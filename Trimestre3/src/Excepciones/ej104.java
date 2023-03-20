
package Excepciones;

import java.util.Scanner;

public class ej104 {
    public static void main(String[] args){
        Scanner t=new Scanner(System.in);
        System.out.println("Introduzca el tamaño del array");
        int tam=t.nextInt();
        try {
             if(tam<0) throw new Exception();
        } catch (Exception e) {
            System.out.println("El tamaño del array no puede ser negativo " + e.getMessage());
        }
        double lista[]=new double[tam];
        for (int i = 0; i < tam; i++) {
            try {
                if (i>tam || i<0)throw new IndexOutOfBoundsException();
                System.out.println("Introduzca valor para la posicion");
                lista[i]=t.nextDouble();
            } catch (IndexOutOfBoundsException e) {
                System.out.println("La posicion se encuentra fuera del array");
                
            }
       
        }
    }

}
