
package EjercicioCafetera;

public class testCafetera {
    public static void main(String[] args){
        Cafetera toshiba=new Cafetera();
        toshiba.revisionCapacidad();
        toshiba.echarCafe(150);
        toshiba.servirCafe(50);
        toshiba.revisionCapacidad();
        toshiba.llenarCafetera();
        toshiba.revisionCapacidad();
        toshiba.vaciarCafetera();
        toshiba.servirCafe(100);
        toshiba.llenarCafetera();
        toshiba.echarCafe(1300);
    }

}
