
package ej75;

public class testCuenta {
    public static void main(String[] args){
        Cuenta c1=new Cuenta("Nacho");
        c1.ingresar(100);
        System.out.println(c1);
        c1.retirar(50);
        c1.ingresar(-5);
        c1.retirar(-10);
        System.out.println(c1);
    }

}
