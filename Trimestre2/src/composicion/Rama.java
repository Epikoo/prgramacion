/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composicion;

/**
 *
 * @author usuario
 */
public class Rama {
    private double longitud;
    private String color;
    private boolean partida;
    private Hoja []joja;
    
    public Rama(double mide, String col, int nhojas){
        this.longitud=mide;
        this.color=col;
        this.partida=false;
         joja=new Hoja[nhojas];
        for (int i = 0; i < nhojas; i++) {
        joja[i]= new Hoja("verde", 2, 3);
        }
        
        
    }
    public void partirse(){
            if (!partida) {
            this.partida=true;
            this.joja=null;       
                }
        }

    @Override
    public String toString() {
        String res="Rama{" + "longitud=" + longitud + ", color=" + color + ", partida=" + partida + ", joja=" + joja + '}';
        res+=this.joja[0].toString();
        return res;
    }
        
}
