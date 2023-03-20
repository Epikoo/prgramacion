/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejAgregacionGuerrero;

/**
 *
 * @author usuario
 */
public class Guerrero {

    private String nombre;
    private int saludmax;
    private int ataque;
    private int escudo;
    private int saludactual;
    private boolean muerto;
    private Arma gun;
    private int nivel;
    private int expActual;
    private int siguienteNivel;
    

    public Guerrero(String name, int atk, int shield, int vidamax, Arma armita) {
        this.saludmax = vidamax;
        this.nombre = name;
        this.saludactual = saludmax;
        this.ataque = atk;
        this.escudo = shield;
        this.muerto = false;
        this.gun = armita;
        this.nivel=1;
        this.expActual=0;
        this.siguienteNivel=12;

    }

    @Override
    public String toString() {
        return "Guerrero{" + "nombre=" + nombre + ", saludmax=" + saludmax + ", ataque=" + ataque + ", escudo=" + escudo + ", saludactual=" + saludactual + '}';
    }

    public void atacar(Guerrero guerritas) {
        int hostion = 0;
        if (!this.muerto) {
            if (this.gun.getResistencia() <= 0) {
                hostion = this.ataque - guerritas.escudo;
                this.expActual+=5;
            } else {
                this.gun.setResistencia(this.gun.getResistencia() - 1);
                hostion = (this.ataque + this.gun.getPoder()) - guerritas.escudo;
                this.expActual+=3;
            }
            
        }
        if (hostion < 0) {
                    hostion = 0;
                }
        guerritas.saludactual-=hostion;
        this.checkmuerto(guerritas);
        if(this.subir()){
                this.subidaNivel();
            }
    }
    private void subirNivel(Arma armmita){
        armmita.setNivel(armmita.getNivel()+1);
        armmita.setPoder(armmita.getPoder()+2);
        armmita.setResistencia(armmita.getResistencia()+3);
    }

    private void checkmuerto(Guerrero guerritas) {
        if (guerritas.saludactual <= 0) {
            guerritas.muerto = true;
        } else {
            guerritas.muerto = false;
        }
       
    }
    private Boolean subir(){
        return this.expActual>=this.siguienteNivel;
    }
    private void subidaNivel(){
        this.nivel++;
        this.expActual=0;
        this.siguienteNivel =12;
        this.ataque++;
        this.escudo++;
        this.saludactual+=10;
    }
     public  void mejorArarma(String nombrearma){
         if (this.gun.getNombre().equalsIgnoreCase(nombrearma)) {
             
         }
        }
}
