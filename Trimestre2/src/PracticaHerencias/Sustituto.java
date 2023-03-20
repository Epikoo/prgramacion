//ignacio diaz romero
package PracticaHerencias;

public class Sustituto extends Mestizo {

    protected String zonaasegurada;

    public Sustituto(String nombre, String origen, int edad, Zanpakuto espada, String zona) {
        super(nombre, origen, edad, espada);
        zonaasegurada = zona;
    }

    @Override
    public String toString() {
        return this.nombre + " [ Vida: " + this.vida + " poder : " + this.poder + " ] Shinigami Sustituto \n" + this.getEspada().toString();
    }

    @Override
    public void invocarBankai() {
        this.getEspada().bankai(hollow / 10, 2);
        System.out.println(nombre + "ha invocado su bankai ");
    }

    @Override
    public void pelear(Shinigami guerrero) {
        if (guerrero instanceof Sustituto) {
            double dañoentrante = this.getEspada().getAtaque() - guerrero.getEspada().getResistencia(); //para controlar que no se quede el daño en negativo
            dañoentrante = dañoentrante < 0 ? 0 : dañoentrante;
            guerrero.vida -= dañoentrante;
        } else if (guerrero instanceof Teniente) {
            double dañoentrante = (this.getEspada().getAtaque() + this.poder) - guerrero.getEspada().getResistencia(); //para controlar que no se quede el daño en negativo
            dañoentrante = dañoentrante < 0 ? 0 : dañoentrante;
            guerrero.vida -= dañoentrante;
        } else if (guerrero instanceof Capitan) {
            double dañoentrante = this.getEspada().getAtaque() - (guerrero.getEspada().getResistencia() + this.poder); //para controlar que no se quede el daño en negativo
            dañoentrante = dañoentrante < 0 ? 0 : dañoentrante;
            guerrero.vida -= dañoentrante;
        }
    }
}
