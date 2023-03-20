//ignacio diaz romero
package PracticaHerencias;

public class Zanpakuto {

    private String nombre;
    private double anchura;
    private double altura;
    private boolean estado;// true shinkai false para bankai
    private double ataque;
    private double resistencia;
    private double ataqueale;//Nos sirve para controlar el valor original y no perderlo al cambiar de estado
    private double resiale;//Nos sirve para controlar el valor original y no perderlo al cambiar de estado

    public Zanpakuto(String nombre, double anchura, double altura) {
        this.nombre = nombre;
        this.anchura = anchura;
        this.altura = altura;
        this.ataqueale = (int) (Math.random() * 24 + 2);
        this.resiale = (int) (Math.random() * 81 + 70);
        this.ataque = this.ataqueale;
        this.resistencia = this.resiale;
        this.estado = true;
    }

    public void bankai(double multiataque, double multiresi) {
        if (estado) {
            estado = false;
            this.ataque *= multiataque;
            this.resiale *= multiresi;
        } else {
            System.out.println("El Zanpakuto ya esta en modo bankai");
        }
    }

    public void shikai() {
        if (!estado) {
            this.estado = true;
            this.ataque = this.ataqueale;
            this.resistencia = this.resiale;
        } else {
            System.out.println("El Zanpakuto ya esta en modo bankai");
        }

    }

    public double getAtaque() { //necesitamos los valores para atacar
        return ataque;
    }

    public double getResistencia() { //necesitamos los valores para atacar
        return resistencia;
    }

    public void setEstado(boolean estado) { //para poder cambiar el estado fuera de esta clase
        this.estado = estado;
    }

    @Override
    public String toString() {
        return this.nombre + "[ Atq : " + this.ataque + " , res: "
                + this.resistencia + " ]" + this.estado;
    }

}
