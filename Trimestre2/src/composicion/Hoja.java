/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composicion;

/**
 *
 * @author usuario
 */
public class Hoja {
    private String color;
    private double ancho;
    private double largo;
    
    public Hoja (String colorsito, double anch, double  longe){
        this.color=colorsito;
        this.ancho=anch;
        this.largo=longe;
                
    }

    @Override
    public String toString() {
        String res= "Hoja{" + "color=" + color + ", ancho=" + ancho + ", largo=" + largo + '}';
        return res;
    }
    public void crecer(){
        this.ancho*=1.00025;
        this.largo*=1.0543;
    }
}
