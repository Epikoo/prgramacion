//ignacio diaz romero
package PracticaHerencias;

public class Teniente extends Puro {

    public Teniente(String nombre, String origen, int edad, Zanpakuto espada, int escuadron) {
        super(nombre, origen, edad, espada, escuadron);
    }

    @Override
    public String toString() {
        return this.nombre + " [ Vida : " + this.vida + " , poder: " + this.poder + "] "
                + " Teniente del " + this.escuadron + "\n" + this.getEspada().toString();
    }

    @Override
    public void invocarBankai() {
        System.out.println(nombre + " aún no puede invocar su bankai");

    }

    @Override
    public void pelear(Shinigami guerrero) {
        if (guerrero instanceof Teniente) {
            double dañoentrante = this.getEspada().getAtaque() - guerrero.getEspada().getResistencia(); //para controlar que no se quede el daño en negativo
            dañoentrante = dañoentrante < 0 ? 0 : dañoentrante;
            guerrero.vida -= dañoentrante;
        } else if (guerrero instanceof Capitan || guerrero instanceof Sustituto) {
            double dañoentrante = this.getEspada().getAtaque() - (guerrero.getEspada().getResistencia() + guerrero.poder); //para controlar que no se quede el daño en negativo
            dañoentrante = dañoentrante < 0 ? 0 : dañoentrante;
            guerrero.vida -= dañoentrante;
        }
    }
}
