//ignacio diaz romero
package PracticaHerencias;

public abstract class Puro extends Shinigami {

    protected int escuadron;

    public Puro(String nombre, String origen, int edad, Zanpakuto espada, int escuadron) {
        super(nombre, origen, edad, espada);
        if (escuadron > 13 || escuadron < 1) { //control numerico para el escuadro 1-13
            this.escuadron = (int) (Math.random() * 13 + 1);
        } else {
            this.escuadron = escuadron;
        }
    }

    public void shunpo() {
        System.out.println(this.nombre + " se ha desplazado usando Shunpo");
    }
    //al ser abstracta los metodos abstractos siguen esperando a ser sobreescritos

}
