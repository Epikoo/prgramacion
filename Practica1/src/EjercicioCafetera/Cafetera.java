/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioCafetera;

/**
 *
 * @author usuario
 */
public class Cafetera {

    int capacidad;

    public Cafetera() {
        this.capacidad = 0;
    }

    public void echarCafe(int recarga) {
        if (recarga < 1) {
            System.out.println("La cantidad a depositar debe ser positiva");
        } else {
            System.out.println("Se ha recargado " + recarga + "cc");
            this.capacidad += recarga;
            if (this.capacidad > 1000) {
                System.out.println("La cafetera ha desbordado y ha perdido la cantidad de " + (this.capacidad -1000) + "cc");
                this.capacidad = 1000;
            }
        }
    }

    public void llenarCafetera() {
        this.capacidad = 1000;
        System.out.println("La cafetera fue llenada con exito");
    }

    public void vaciarCafetera() {
        this.capacidad = 0;
        System.out.println("Se ha tirado todo el cafe");
    }

    public void servirCafe(int capacidadTaza) {
        if (capacidadTaza < 1) {
            System.out.println("La taza ha de tener un valor positivo");
        } else {
            if (this.capacidad - capacidadTaza <= 0) {
                System.out.println("No hay suficiente cafe para esta taza");
            } else {
                System.out.println("La taza fue servida");
                this.capacidad -= capacidadTaza;
            }
        }
    }

    public void revisionCapacidad() {
        System.out.println("Queda " + this.capacidad + " cc de cafe en la cafetera");
    }
}
