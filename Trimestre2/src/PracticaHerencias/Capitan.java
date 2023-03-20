
//ignacio diaz romero
package PracticaHerencias;

public class Capitan extends Puro{
    public Capitan(String nombre, String origen, int edad, Zanpakuto espada, int escuadron){
        super(nombre, origen, edad, espada, escuadron);
    }
    
    @Override
    public void invocarBankai(){
        this.getEspada().bankai(this.escuadron*1.5, 1.5);
        System.out.println(nombre + "ha invocado su bankai");
         getEspada().setEstado(false);
    }
    
    @Override
    public void pelear(Shinigami guerrero){
        if (guerrero instanceof  Capitan) {
             double dañoentrante = this.getEspada().getAtaque() - guerrero.getEspada().getResistencia(); //para controlar que no se quede el daño en negativo
            dañoentrante = dañoentrante < 0 ? 0 : dañoentrante;
            guerrero.vida -= dañoentrante;
        }else if (guerrero instanceof  Teniente) {
             double dañoentrante = (this.getEspada().getAtaque()+poder) - guerrero.getEspada().getResistencia(); //para controlar que no se quede el daño en negativo
            dañoentrante = dañoentrante < 0 ? 0 : dañoentrante;
            guerrero.vida -= dañoentrante;
        }else if(guerrero instanceof Sustituto){
             double dañoentrante = this.getEspada().getAtaque() - (guerrero.getEspada().getResistencia()+ poder); //para controlar que no se quede el daño en negativo
            dañoentrante = dañoentrante < 0 ? 0 : dañoentrante;
            guerrero.vida -= dañoentrante;
        }
    }
    @Override
       public String toString(){
        return this.nombre + " [ Vida : " + this.vida + " , poder: " + this.poder + "] "
                + " Capitan del "  +  this.escuadron + "\n" + this.getEspada().toString();
    }
}
