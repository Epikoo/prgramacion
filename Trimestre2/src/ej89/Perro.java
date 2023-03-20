

package ej89;

public class Perro extends Mamifero{
   private String raza, nombre;
   private boolean mezcla;
   
   public Perro(int npatas, double mvida, String raza, String nombre){
       super(npatas, mvida);
       this.raza=raza;
       this.nombre=nombre;
       this.mezcla=false;
   }
   
   @Override
  public String comunicarse(){
        return "GUAU" ;
    }
   @Override
  public String dormir(){
        return " El mamifero suele dormir " + 18 + " horas";
    }
  public String jugar(){
      return this.nombre + " esta jugnado";
  }
  public String toString(){
      return super.toString()+"\n Se trata de un perro con " + super.getNpatas()
              +" y suelen vivir " + super.getMedia_vida() + " años";
  }
  
}
