//ignacio diaz romero
package PracticaHerencias;

public abstract class Shinigami {

    protected String nombre;
    protected String origen;
    protected int edad;
    protected double vida;
    protected double poder;
    private Zanpakuto espada;

    public Shinigami(String nombre, String origen, int edad, Zanpakuto espada) {
        this.nombre = nombre;
        this.origen = origen;
        this.edad = edad;
        this.espada = espada;
        this.vida = 1500;
        this.poder = Math.random() * 46 + 5;

    }

    public abstract void invocarBankai();

    public abstract void pelear(Shinigami guerrero);

    @Override
    public String toString() {
        return this.nombre + "[ Vida:" + this.vida + " , poder: " + this.poder + "\n" + espada.toString();
    }

    public Zanpakuto getEspada() { // para poder acceder a los valores de la espada como ataque y resi
        return espada;
    }

}
