package ej75;

public class Cuenta {

    private String titular;
    private int cantidad;

    public Cuenta(String nombre) {
        this.titular = nombre;
        this.cantidad = 0;

    }

    public Cuenta(String nombre, int dinero) {
        this.titular = nombre;
        if (dinero > 0) {
            this.cantidad = dinero;
        } else {
            this.cantidad = 0;
        }
    }

    public void ingresar(int ingreso) {
        if (ingreso < 0) {
            ingreso = 0;
        }
        this.cantidad += ingreso;
    }

    public void retirar(int retiro) {
        if (retiro < 0) {
            retiro = 0;
        }
        this.cantidad -= retiro;
    }
    public String toString(){
        return "Esta cuenta pertenece a " + this.titular
                + " y posee actualmente una cantidad de  " + this.cantidad + "€";
    }
}
