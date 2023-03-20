

package ej89;

public class Gato extends Mamifero{
   private String raza, nombre;
   private String pelaje[];
   private String pelajeactual;
   
   public Gato(int npatas, double mvida, String raza, String nombre){
       super(npatas, mvida);
       this.raza=raza;
       this.nombre=nombre;
       this.pelaje=new String[]{"corto", "largo" , "semilargo"};
       this.pelajeactual=this.pelaje[0];
   }
   
   @Override
  public String comunicarse(){
        return "MIAU" ;
    }
   @Override
  public String dormir(){
        return " El mamifero suele dormir " + 15 + " horas";
    }
  public String cazar(){
      return "Mi gato de " + super.getNpatas() + "  patas y está cazando";
  }
  public String toString(){
      return super.toString()  + "\n Se trata de un gato con un pelaje " + this.pelajeactual ;
  }

    public String[] getPelaje() {
        return pelaje;
    }

    public void setPelaje(String[] pelaje) {
        this.pelaje = pelaje;
    }
  
  
}

