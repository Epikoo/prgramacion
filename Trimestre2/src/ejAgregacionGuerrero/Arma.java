/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejAgregacionGuerrero;

public class Arma {

    private String nombre;
    private int resistencia;
    private int poder;
    private int nivel;

    public int getNivel() {
        return nivel;
    }

    public Arma(String name, int stamina, int power) {
        this.nombre = name;
        this.resistencia = stamina;
        this.poder = power;

    }
    

    @Override
    public String toString() {
        return "Arma{" + "nombre=" + nombre + ", resistencia=" + resistencia + ", poder=" + poder + '}';
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    public int getPoder(){
        return this.poder;
    }
    public int getResistencia(){
        return  this.resistencia;
    }
    public void setResistencia( int nuevares){
        this.resistencia=nuevares;
    }
    public String getNombre(){
        return this.nombre;
    }
}
