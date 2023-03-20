//ignacio diaz romero


package PracticaHerencias;

public abstract class Mestizo extends Shinigami {

    protected double hollow;
    protected double quincy;

    public Mestizo(String nombre, String origen, int edad, Zanpakuto espada) {
        super(nombre, origen, edad, espada);
        this.hollow = Math.random() * 41 + 10;
        this.quincy = this.hollow - 50;
    }
}
