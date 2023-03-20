

package ej89;

public class Mamifero {
    private int npatas;
    private double media_vida;
    
    public Mamifero(int npatas, double mvida){
        this.npatas=npatas;
        this.media_vida=mvida;
    }
    
    public String comunicarse(){
        return "";
    }
    
    public String dormir(){
        return " El mamifero suele dormir " + 8 + " horas";
    }
    
    public String toString(){
        return "Este mamifero tiene " + this.npatas + "  patas, suele vivir " 
                + this.media_vida + "años";
    }

    public int getNpatas() {
        return npatas;
    }

    public double getMedia_vida() {
        return media_vida;
    }
    
}
