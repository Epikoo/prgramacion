/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioPives;

/**
 *
 * @author usuario
 */
public class Pibe {

    String nombre;
    int vidas, hambre;
    double stamina;
    boolean vivo;
    final double MAXSTAMINA = 10;
    final int MAXHAMBRE = 3;

    public Pibe(String nombre) {
        this.nombre = nombre;
        this.stamina = MAXSTAMINA;
        this.hambre = MAXHAMBRE;
        this.vidas = 7;
        this.vivo = true;
    }

    public void comer() {
        if (this.vivo) {
            System.out.println(this.nombre + "Esta zampando");
            this.stamina -= 2;
            this.hambre += 2;
            if (this.hambre > MAXHAMBRE) {
                this.hambre = MAXHAMBRE;
            }
            this.comprobarExistencia();
        }
    }

    public void comunicarse() {
        if (this.vivo) {
            System.out.println(this.nombre + "Esta echando calentandote el oido");
            this.stamina--;
            this.comprobarExistencia();
        } else {
            System.out.println("EL PIVE ESTA FALLEICIDO");
        }

    }

    public void jugar() {
        if (vivo) {
            System.out.println(this.nombre + "Esta echando el rato");
            this.stamina -= 3;
            this.hambre--;
        } else {
            System.out.println("EL PIVE ESTA FALLEICIDO");
        }

    }

    public void dormir() {
        if (vivo) {
            System.out.println(this.nombre + "Esta sobando");
            this.stamina += 5;
            if (this.stamina > MAXSTAMINA) {
                this.stamina = MAXSTAMINA;
            }

        } else {
            System.out.println("EL PIVE ESTA FALLEICIDO");
        }
    }

    public void comprobarExistencia() {
        if (this.stamina < 1 || this.hambre < 1) {
            this.vidas--;
            if (this.vidas <= 0) {
                this.morir();
            } else {
                this.stamina = MAXSTAMINA;
                this.hambre = MAXHAMBRE;
            }

        }
    }

    public void morir() {
        System.out.println("GAME OVER" );
        this.vivo = false;
        this.hambre = -1;
        this.vidas = -1;
        this.stamina = -1;
    }
    public String toString(){
        String res;
        res="";
        res+=this.nombre + "\n";
        res+="Esfuerzo: "+this.stamina+ " Hambre: " + this.hambre+ " Vidas: " + this.vidas + "\n";
        if (this.vivo) {
            res+= " Esta vivo";
        }else{
            res+= " Procedio a la moricion";
        }
        return res;
    }

}
