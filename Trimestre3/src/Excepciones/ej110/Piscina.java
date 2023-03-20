

package Excepciones.ej110;

public class Piscina {
    public final int MAXNIVEL;
    private int nivel;
    
    public Piscina (int tope){
        if (tope<0) throw new RuntimeException();
        this.MAXNIVEL = tope;
        this.nivel=0;
    }
    public int getNivel(){
        return this.nivel;
    }
    public void quitarAgua (int cantidad) throws Exception{
        if (nivel-cantidad<0)  throw new Exception(Integer.toString(nivel));
        this.nivel-=cantidad;
    }
    public void ponerAgua(int cantidad) throws Exception{
         if (nivel+cantidad>MAXNIVEL)  throw new Exception("No puedes añadir mas porque puede rebosar " +(this.nivel+cantidad) +  " es mayor que " + this.MAXNIVEL);
        this.nivel += cantidad;
    }
}
