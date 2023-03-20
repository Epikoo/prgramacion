

package ej98;

public class Articulo {
    private String nombre;
    private double precio;
    
    public Articulo(String nombre, double precio){
        this.nombre=nombre;
        this.precio=precio;
    }
    public String toString(){
        return "Articulo: " + this.nombre + "\nPrecio: " + this.precio;
            
    }
}
